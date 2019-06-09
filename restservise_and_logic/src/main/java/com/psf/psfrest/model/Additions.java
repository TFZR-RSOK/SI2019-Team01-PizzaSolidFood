package com.psf.psfrest.model;

public class Additions {
    private String additionName;
    private double additionPrice;

    public Additions(String additionName, double additionPrice) {
        this.additionName = additionName;
        this.additionPrice = additionPrice;
    }

    public String getAdditionName() {
        return additionName;
    }

    public void setAdditionName(String additionName) {
        this.additionName = additionName;
    }

    public double getAdditionPrice() {
        return additionPrice;
    }

    public void setAdditionPrice(double additionPrice) {
        this.additionPrice = additionPrice;
    }
}
