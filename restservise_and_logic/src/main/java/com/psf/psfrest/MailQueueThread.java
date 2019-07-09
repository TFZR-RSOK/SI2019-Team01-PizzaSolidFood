package com.psf.psfrest;

import com.psf.psfrest.model.MailDetails;
import com.psf.psfrest.service.email.Mail;
import it.ozimov.springboot.mail.service.exception.CannotSendEmailException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

@Component
public class MailQueueThread implements Runnable {

    @Autowired
    private Mail mail;

    public static Queue<MailDetails> mailQueue;

    public MailQueueThread() {
        mailQueue = new ConcurrentLinkedQueue<>();
    }

    @Override
    public void run() {

        while (true) {
            MailDetails mailDetails = mailQueue.poll();

            if (mailDetails != null) {
                try {
                    switch (mailDetails.getEmailType()) {
                        case BILL: mail.sendBillEmail(mailDetails.getUserEmail(), mailDetails.getOrderNum(), mailDetails.getUserAddress()); break;
                        case NEWSLETTER: mail.newsletter(mailDetails.getUserEmail()); break;
                        case CUSTOMER_MSG: mail.customerMsg(mailDetails.getEmailSubject(), mailDetails.getUserName(), mailDetails.getUserEmail(), mailDetails.getMailBody()); break;
                        case CONGRATS_EMAIL: mail.sendCongratulationsToNewPremiumUser(mailDetails.getUserName(), mailDetails.getUserEmail()); break;
                        case DOWNGRADE_EMAIL: mail.sendDowngrade(mailDetails.getUserName(), mailDetails.getUserEmail()); break;
                    }

                    System.out.println("Mail sent");
                } catch (IOException | CannotSendEmailException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
