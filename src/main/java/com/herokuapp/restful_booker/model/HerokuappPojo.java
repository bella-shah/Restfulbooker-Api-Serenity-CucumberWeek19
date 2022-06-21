package com.herokuapp.restful_booker.model;

import io.vavr.collection.HashMap;

public class HerokuappPojo {
    private String username;
    private String password;

    private String firstname;
    private String lastname;
    private Integer totalprice;
    private Boolean depositpaid;
    private HashMap<Object, Object> bookingdates;
    private String additionalneeds;
    private HashMap<Object, Object> bookingsDatesData;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    public Boolean getDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(Boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public HashMap<Object, Object> getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(HashMap<Object, Object> bookingdates) {
        this.bookingdates = bookingdates;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }


    public HashMap<Object, Object> getBookingDatesData() {
        return bookingsDatesData;
    }

    public void setBookingsDatesData(HashMap<Object, Object> bookingsDatesData) {
        this.bookingsDatesData = bookingsDatesData;
    }

    public void setBookingdates(java.util.HashMap<Object, Object> bookingsDatesData) {
    }
}


