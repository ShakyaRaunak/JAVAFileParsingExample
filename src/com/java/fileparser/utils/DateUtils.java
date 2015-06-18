package com.java.fileparser.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by raunakshakya on 6/17/15.
 */
public class DateUtils {

    private final static SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public static Date parseDate(String dateAsString) {
        Date date = null;
        try {
            date = SIMPLE_DATE_FORMAT.parse(dateAsString);
        } catch (ParseException e) {
            System.out.println("Unable to parse the date string!");
        } finally {
            return date;
        }
    }

    public static boolean isCurrentDateBetweenTwoDates(Date fromDate, Date toDate) {
        Date currentDate = new Date();
        return fromDate.compareTo(currentDate) * currentDate.compareTo(toDate) > 0;
    }

}
