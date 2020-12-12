package com.szoftlab.weddingplanner.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

//@Entity
public class TaskAddress {


    private String street;

    private String houseNum;

    private String city;

    private Long postalcode;


   // private WeddingTask task;



    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(Long postalcode) {
        this.postalcode = postalcode;
    }
/*
    public WeddingTask getTask() {
        return task;
    }

    public void setTask(WeddingTask task) {
        this.task = task;
    }

 */
}
