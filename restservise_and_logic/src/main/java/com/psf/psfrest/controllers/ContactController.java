package com.psf.psfrest.controllers;

import com.psf.psfrest.service.email.IMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

@RestController
public class ContactController {

    @Autowired
    private IMail mail;

    @GetMapping("/public/contact/{customerMail}{name}{subject}{msg}")
    public void contact(@PathVariable("subject") String subject,
                        @PathVariable("name") String name,
                        @PathVariable("customerMail") String customerMail,
                        @PathVariable("msg") String msg) throws UnsupportedEncodingException {
        mail.customerMsg(subject, name, customerMail, msg);
    }

}
