package com.sabzi_bazzer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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
    public String C_date1()
    {
    SimpleDateFormat formatter = new SimpleDateFormat("dd,MMM yyyy");
	Date date = new Date();
	return formatter.format(date);
    }
    public String tomorrowdate()
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd,MMM yyyy");
        Calendar calendar = Calendar.getInstance();
	Date date = new Date();
         calendar.add(Calendar.DATE, 1);
            date = calendar.getTime();
            formatter = new SimpleDateFormat("dd,MMM yyyy");
  return  formatter.format(date);
    }
}