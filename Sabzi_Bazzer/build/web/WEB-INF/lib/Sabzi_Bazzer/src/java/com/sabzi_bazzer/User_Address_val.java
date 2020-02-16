/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sabzi_bazzer;

/**
 *
 * @author SoumenPC
 */
public class User_Address_val {
       String house_number,street_number1,vill_town1,post_office1,police_station1,s_town,s_state,pin_code1,landmark1,email;

    public User_Address_val(String house_number, String street_number1, String vill_town1, String post_office1, String police_station1, String s_town, String s_state, String pin_code1, String landmark1, String email) {
        this.house_number = house_number;
        this.street_number1 = street_number1;
        this.vill_town1 = vill_town1;
        this.post_office1 = post_office1;
        this.police_station1 = police_station1;
        this.s_town = s_town;
        this.s_state = s_state;
        this.pin_code1 = pin_code1;
        this.landmark1 = landmark1;
        this.email = email;
    }

    public User_Address_val() {
    }

    public String getHouse_number() {
        return house_number;
    }

    public void setHouse_number(String house_number) {
        this.house_number = house_number;
    }

    public String getStreet_number1() {
        return street_number1;
    }

    public void setStreet_number1(String street_number1) {
        this.street_number1 = street_number1;
    }

    public String getVill_town1() {
        return vill_town1;
    }

    public void setVill_town1(String vill_town1) {
        this.vill_town1 = vill_town1;
    }

    public String getPost_office1() {
        return post_office1;
    }

    public void setPost_office1(String post_office1) {
        this.post_office1 = post_office1;
    }

    public String getPolice_station1() {
        return police_station1;
    }

    public void setPolice_station1(String police_station1) {
        this.police_station1 = police_station1;
    }

    public String getS_town() {
        return s_town;
    }

    public void setS_town(String s_town) {
        this.s_town = s_town;
    }

    public String getS_state() {
        return s_state;
    }

    public void setS_state(String s_state) {
        this.s_state = s_state;
    }

    public String getPin_code1() {
        return pin_code1;
    }

    public void setPin_code1(String pin_code1) {
        this.pin_code1 = pin_code1;
    }

    public String getLandmark1() {
        return landmark1;
    }

    public void setLandmark1(String landmark1) {
        this.landmark1 = landmark1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
       
}
