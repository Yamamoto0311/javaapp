package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetDaysBetweenDatesTest {

    @Test
    public void testGetDaysBetweenDates() {
        String startDate = "2023/04/01";
        String endDate = "2023/04/10";
        long expectedDays = 9; // 4月1日から4月10日までの日数
        assertEquals(expectedDays, GetDaysBetweenDates.getDaysBetweenDates(startDate, endDate));

        startDate = "2023/04/01";
        endDate = "2023/04/01";
        expectedDays = 0; // 同じ日の日数差は0
        assertEquals(expectedDays, GetDaysBetweenDates.getDaysBetweenDates(startDate, endDate));

        startDate = "2023/03/01";
        endDate = "2023/04/01";
        expectedDays = 31; // 3月1日から4月1日までの日数
        assertEquals(expectedDays, GetDaysBetweenDates.getDaysBetweenDates(startDate, endDate));
    }
}
