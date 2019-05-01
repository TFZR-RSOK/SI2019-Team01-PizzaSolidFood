package com.psf.psfrest.model;

public class User {

    private String userName;
    private String userLastname;
    private String email;
    private Integer userType;
    private String address;
    private Integer points;
    private Integer monthlyOrders;
    private String token; // ignore
    public User(){}

    public User(String token, String userName, String userLastname, String email) {
        this.token = token;
        this.userName = userName;
        this.userLastname = userLastname;
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastname() {
        return userLastname;
    }

    public void setUserLastname(String userLastname) {
        this.userLastname = userLastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getMonthlyOrders() {
        return monthlyOrders;
    }

    public void setMonthlyOrders(Integer montlyOrders) {
        this.monthlyOrders = montlyOrders;
    }
}
