package com.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NextWeekdayCalculator {

    // 与えられた日付が平日か否かを判定するメソッド
    public static boolean isWeekday(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date inputDate = dateFormat.parse(date);
            Calendar cal = Calendar.getInstance();
            cal.setTime(inputDate);
            int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
            return (dayOfWeek != Calendar.SATURDAY && dayOfWeek != Calendar.SUNDAY);
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }

    // 次の平日を計算するメソッド
    public static String getNextWeekday(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date inputDate = dateFormat.parse(date);
            Calendar cal = Calendar.getInstance();
            cal.setTime(inputDate);
            do {
                cal.add(Calendar.DAY_OF_MONTH, 1);
            } while (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY);
            return dateFormat.format(cal.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String date = "2023/07/21"; // example date
        boolean isWeekday = isWeekday(date);
        System.out.println(date + " is a weekday: " + isWeekday);

        String nextWeekday = getNextWeekday(date);
        System.out.println("The next weekday after " + date + " is: " + nextWeekday);
    }
}

