package com.psf.psfrest.service.email;

import com.google.common.collect.Lists;
import it.ozimov.springboot.mail.model.Email;
import it.ozimov.springboot.mail.model.ImageType;
import it.ozimov.springboot.mail.model.InlinePicture;
import it.ozimov.springboot.mail.model.defaultimpl.DefaultEmail;
import it.ozimov.springboot.mail.model.defaultimpl.DefaultInlinePicture;
import it.ozimov.springboot.mail.service.EmailService;
import it.ozimov.springboot.mail.service.exception.CannotSendEmailException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.internet.InternetAddress;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

@Service
public class Mail implements IMail{

    @Autowired
    public EmailService emailService;


    public void sendNoReplyMail() {

    }

    @Override
    public void customerMsg() {

    }

    private void mail(String address, String subject) throws UnsupportedEncodingException, CannotSendEmailException {
        final Email email = DefaultEmail.builder()
                .from(new InternetAddress("psf.no.reply@gmail.com", "rest service"))
                .to(Lists.newArrayList(new InternetAddress("kalamin.michal@gmail.com", "Personal")))
                .subject("Subject")
                .body("")
                .encoding("UTF-8").build();

        final Map<String, Object> modelObject = new HashMap<>();
        final File imageFile = new File("../resources/email template/images");
        modelObject.put("tyrannicida", "Test");

        final InlinePicture inlinePicture = DefaultInlinePicture.builder()
                .file(imageFile)
                .imageType(ImageType.JPG)
                .templateName("my_image.jpg").build();
                                                                                                // moze is aj viacej obraskov mozno aj lista
        emailService.send(email, "../resources/email template/test_template.html", modelObject, inlinePicture);

    }

}
