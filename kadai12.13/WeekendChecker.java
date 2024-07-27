package com.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class WeekendChecker {

    // 与えられた日付が土日か否かを判定するメソッド
    public static boolean isWeekend(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date inputDate = dateFormat.parse(date);
            Calendar cal = Calendar.getInstance();
            cal.setTime(inputDate);
            int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
            return (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY);
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        String date = "2023/07/22"; // example date
        boolean isWeekend = isWeekend(date);
        System.out.println(date + " is a weekend: " + isWeekend);
    }
}

