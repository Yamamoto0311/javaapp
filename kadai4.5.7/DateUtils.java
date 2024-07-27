package com.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class DateUtils {

    public static List<String> getLastMonthDates(String inputDate) {
        List<String> dateList = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Calendar cal = Calendar.getInstance();
            cal.setTime(dateFormat.parse(inputDate));

            for (int i = 0; i < 30; i++) {
                dateList.add(dateFormat.format(cal.getTime()));
                cal.add(Calendar.DAY_OF_MONTH, -1);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return dateList;
    }

    public static void main(String[] args) {
        String inputDate = "2023/04/26";
        List<String> dateList = getLastMonthDates(inputDate);
        System.out.println(dateList);
    }
}
