package com.psf.psfrest.model;

public class Orders {
    private double totalPrice;
    private int orderNumber;

    public Orders(double totalPrice, int orderNumber) {
        this.totalPrice = totalPrice;
        this.orderNumber = orderNumber;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
}
