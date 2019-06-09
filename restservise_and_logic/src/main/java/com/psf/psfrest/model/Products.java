package com.psf.psfrest.model;

public class Products {
    private String productName;
    private double productPrice;
    private int discountForPremiumUsers;
    private int productSize;
    private String productDescription;
    private String imgPath;

    public Products(String productName, double productPrice, int discountForPremiumUsers, int productSize, String productDescription, String imgPath) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.discountForPremiumUsers = discountForPremiumUsers;
        this.productSize = productSize;
        this.productDescription = productDescription;
        this.imgPath = imgPath;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getDiscountForPremiumUsers() {
        return discountForPremiumUsers;
    }

    public void setDiscountForPremiumUsers(int discountForPremiumUsers) {
        this.discountForPremiumUsers = discountForPremiumUsers;
    }

    public int getProductSize() {
        return productSize;
    }

    public void setProductSize(int productSize) {
        this.productSize = productSize;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getImgPath() {
        return imgPath;
    }
}
