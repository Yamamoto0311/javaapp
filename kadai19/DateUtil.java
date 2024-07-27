package com.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateUtil {

    // 日付演算のメソッド
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
        // テスト用のコード

        // 日付演算のメソッドテスト
        String inputDate = "2023/04/26";
        List<String> lastMonthDates = getLastMonthDates(inputDate);
        System.out.println("Last month dates from " + inputDate + ": " + lastMonthDates);

        // 2日の間の日数を返すメソッドテスト
        String startDate = "2023/04/01";
        String endDate = "2023/04/10";
        long daysBetween = getDaysBetweenDates(startDate, endDate);
        System.out.println("Days between " + startDate + " and " + endDate + ": " + daysBetween);

        // 与えられた日付が平日か否かを判定するメソッドテスト
        String date1 = "2023/07/21"; // example date
        boolean isWeekday = isWeekday(date1);
        System.out.println(date1 + " is a weekday: " + isWeekday);

        // 与えられた日付が土日か否かを判定するメソッドテスト
        String date2 = "2023/07/22"; // example date
        boolean isWeekend = isWeekend(date2);
        System.out.println(date2 + " is a weekend: " + isWeekend);
    }
}
