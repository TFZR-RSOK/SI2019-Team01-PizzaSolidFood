package com.psf.psfrest.entity;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="ID_PROD")
    private int idProd;

    @Column(name = "PROD_NAME")
    private String productName;

    @Column(name = "PROD_PRICE")
    private double productPrice;

    @Column(name = "DISCOUNT_FOR_PREMIUM_USERS")
    private int discountForPremiumUsers;

    @Column(name = "PROD_SIZE")
    private int productSize;

    @Column(name = "PROD_DESCRIPTION")
    private String productDescription;

    @Column(name = "IMAGE")
    private String imgPath;

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public void setImgPath(String imgPath) {
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
