package com.psf.psfrest.model;

import com.psf.psfrest.utils.Globals;

public class MailDetails {

    private String userEmail;
    private String userName;
    private int orderNum;
    private String userAddress;
    private String mailBody;
    private Globals.MailEnum emailType;
    private String emailSubject;

    /**
     * Bill
     * */
    public MailDetails(String userEmail, int orderNum, String userAddress, Globals.MailEnum emailType) {
        this.userEmail = userEmail;
        this.orderNum = orderNum;
        this.userAddress = userAddress;
        this.emailType = emailType;
    }

    /**
     * Premium
     * */
    public MailDetails(String userEmail, String userName, Globals.MailEnum emailType) {
        this.userEmail = userEmail;
        this.userName = userName;
        this.emailType = emailType;
    }

    /**
     * Newsletter
     * */
    public MailDetails(String userEmail, Globals.MailEnum emailType) {
        this.userEmail = userEmail;
        this.emailType = emailType;
    }

    /**
     * Contact Us
     * */
    public MailDetails(String userEmail, String subject, String userName, String mailBody, Globals.MailEnum emailType) {
        this.userEmail = userEmail;
        this.userName = userName;
        this.mailBody = mailBody;
        this.emailType = emailType;
        this.emailSubject = subject;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public Globals.MailEnum getEmailType() {
        return emailType;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getMailBody() {
        return mailBody;
    }
}
