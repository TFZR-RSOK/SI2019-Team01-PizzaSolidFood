package com.psf.psfrest.model;

import java.util.Date;

public class Order {
    private double orderPrice;
    private Date dateTime;
    private String payment;
    private int quantity;

    public Order(double orderPrice, Date dateTime, String payment, int quantity) {
        this.orderPrice = orderPrice;
        this.dateTime = dateTime;
        this.payment = payment;
        this.quantity = quantity;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
