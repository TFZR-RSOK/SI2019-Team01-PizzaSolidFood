package com.psf.psfrest.controllers;

import com.psf.psfrest.model.MailDetails;
import com.psf.psfrest.utils.Globals;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static com.psf.psfrest.MailQueueThread.mailQueue;

@RestController
@CrossOrigin
public class ContactController {

    @GetMapping("/public/contact")
    @ResponseStatus(HttpStatus.OK)
    public void contact(@RequestParam(name = "subject") String subject,
                                              @RequestParam(name = "name") String name,
                                              @RequestParam(name = "customerMail") String customerMail,
                                              @RequestParam(name = "msg") String msg) {
        mailQueue.offer(new MailDetails(customerMail, subject, name, msg, Globals.MailEnum.CUSTOMER_MSG));
    }

    @GetMapping("/public/newsletter")
    @ResponseStatus(HttpStatus.OK)
    public void newsletter(@RequestParam(name = "customerMail") String customerMail) {
        mailQueue.offer(new MailDetails(customerMail, Globals.MailEnum.NEWSLETTER));
    }
}
