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
public class Seller_PD_val {

    String first_name,last_name,company_name,licence_number,email,ph_number;

    public Seller_PD_val() {
    }

    public Seller_PD_val(String first_name, String last_name, String company_name, String licence_number, String email, String ph_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        
        this.company_name = company_name;
        this.licence_number = licence_number;
        this.email = email;
        this.ph_number = ph_number;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getLicence_number() {
        return licence_number;
    }

    public void setLicence_number(String licence_number) {
        this.licence_number = licence_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPh_number() {
        return ph_number;
    }

    public void setPh_number(String ph_number) {
        this.ph_number = ph_number;
    }
    
    
}
