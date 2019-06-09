package com.psf.psfrest.model;

public class User {
    private String token;
    private String name;
    private String lastName;
    private String email;
    private int userType;
    private String address;
    private int points;
    private int monthlyOrders;

    public User(String token, String name, String lastName, String email) {
        this.token = token;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getMonthlyOrders() {
        return monthlyOrders;
    }

    public void setMonthlyOrders(int monthlyOrders) {
        this.monthlyOrders = monthlyOrders;
    }
}
