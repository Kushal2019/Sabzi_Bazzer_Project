package com.sabzi_bazzer;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Kushal
 */
public class CurrentDate {
    public String C_date()
    {
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	Date date = new Date();
	return formatter.format(date);
    }
}