package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateUtilsTest {

    @Test
    public void testGetLastMonthDates() {
        String inputDate = "2023/04/26";
        List<String> expectedDates = List.of(
                "2023/04/26", "2023/04/25", "2023/04/24", "2023/04/23", "2023/04/22",
                "2023/04/21", "2023/04/20", "2023/04/19", "2023/04/18", "2023/04/17",
                "2023/04/16", "2023/04/15", "2023/04/14", "2023/04/13", "2023/04/12",
                "2023/04/11", "2023/04/10", "2023/04/09", "2023/04/08", "2023/04/07",
                "2023/04/06", "2023/04/05", "2023/04/04", "2023/04/03", "2023/04/02",
                "2023/04/01", "2023/03/31", "2023/03/30", "2023/03/29", "2023/03/28"
        );

        List<String> actualDates = DateUtils.getLastMonthDates(inputDate);
        assertEquals(expectedDates, actualDates);
    }
}
