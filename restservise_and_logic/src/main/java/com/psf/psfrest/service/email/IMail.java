package com.psf.psfrest.service.email;

import it.ozimov.springboot.mail.service.exception.CannotSendEmailException;

import java.io.IOException;
import java.net.URISyntaxException;

public interface IMail {
    void sendCongratulationsToNewPremiumUser(String userName, String email) throws IOException, CannotSendEmailException, URISyntaxException;
    void sendDowngrade(String userName, String email) throws IOException, CannotSendEmailException, URISyntaxException;
    void sendBillEmail(String email) throws IOException, CannotSendEmailException, URISyntaxException;
    void customerMsg(String subject, String name, String customerMail, String msg);
}
