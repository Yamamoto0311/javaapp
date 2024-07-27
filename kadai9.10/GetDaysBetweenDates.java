package com.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDaysBetweenDates {

    // 2つの日付の間の日数を返すメソッド
    public static long getDaysBetweenDates(String startDate, String endDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date start = dateFormat.parse(startDate);
            Date end = dateFormat.parse(endDate);
            long differenceInMilliseconds = end.getTime() - start.getTime();
            return differenceInMilliseconds / (1000 * 60 * 60 * 24);
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static void main(String[] args) {
        String startDate = "2023/04/01";
        String endDate = "2023/04/10";
        long daysBetween = getDaysBetweenDates(startDate, endDate);
        System.out.println("Days between " + startDate + " and " + endDate + ": " + daysBetween);
    }
}
