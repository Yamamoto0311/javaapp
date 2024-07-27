package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WeekendCheckerTest {

    @Test
    public void testIsWeekend() {
        assertTrue(WeekendChecker.isWeekend("2023/07/22")); // Saturday
        assertTrue(WeekendChecker.isWeekend("2023/07/23")); // Sunday
        assertFalse(WeekendChecker.isWeekend("2023/07/21")); // Friday
        assertFalse(WeekendChecker.isWeekend("2023/07/24")); // Monday
    }
}
