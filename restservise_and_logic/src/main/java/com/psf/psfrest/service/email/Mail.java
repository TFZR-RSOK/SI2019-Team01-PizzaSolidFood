package com.psf.psfrest.service.email;

import com.google.common.collect.Lists;
import it.ozimov.springboot.mail.model.Email;
import it.ozimov.springboot.mail.model.defaultimpl.DefaultEmail;
import it.ozimov.springboot.mail.service.EmailService;
import it.ozimov.springboot.mail.service.exception.CannotSendEmailException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.internet.InternetAddress;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class Mail implements IMail{

    @Autowired
    public EmailService emailService;

    private void mail(String userName, String address, String subject, String emailTemplate) throws IOException, CannotSendEmailException {
        final Email email = DefaultEmail.builder()
                .from(new InternetAddress("psf.no.reply@gmail.com", "Pizza Solid Food"))
                .to(Lists.newArrayList(new InternetAddress(address, "Pizza Solid Food")))
                .subject(subject)
                .body("")
                .encoding("UTF-8").build();

        //Defining the model object for the given Freemarker template
        final Map<String, Object> modelObject = new HashMap<>();
        modelObject.put("userName", userName);

        emailService.send(email, emailTemplate, modelObject);
    }


    @Override
    public void sendCongratulationsToNewPremiumUser(String userName, String email) throws IOException, CannotSendEmailException {
        mail(userName, email, "Premium Account", "premium.ftl");
    }

    @Override
    public void sendDowngrade(String userName, String email) throws IOException, CannotSendEmailException {
        mail(userName, email, "Premium Account Expired", "premium-expired.ftl");
    }

    @Override
    public void sendBillEmail(String email) throws IOException, CannotSendEmailException {
        //mail(email, "Order", "bill.ftl");
    }

    @Override
    public void customerMsg(String subject, String name, String customerMail, String msg) {

    }
}
