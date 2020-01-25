/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sabzi_bazzer;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author SoumenPC
 */
public class CurrentDate {
    public String C_date()
    {
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	Date date = new Date();
	return formatter.format(date);
    }
}
