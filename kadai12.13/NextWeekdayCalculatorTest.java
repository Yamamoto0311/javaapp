package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NextWeekdayCalculatorTest {

    @Test
    public void testIsWeekday() {
        assertTrue(NextWeekdayCalculator.isWeekday("2023/07/21")); // Friday
        assertFalse(NextWeekdayCalculator.isWeekday("2023/07/22")); // Saturday
        assertFalse(NextWeekdayCalculator.isWeekday("2023/07/23")); // Sunday
        assertTrue(NextWeekdayCalculator.isWeekday("2023/07/24")); // Monday
    }

    @Test
    public void testGetNextWeekday() {
        assertEquals("2023/07/24", NextWeekdayCalculator.getNextWeekday("2023/07/21")); // Next weekday after Friday
        assertEquals("2023/07/24", NextWeekdayCalculator.getNextWeekday("2023/07/22")); // Next weekday after Saturday
        assertEquals("2023/07/24", NextWeekdayCalculator.getNextWeekday("2023/07/23")); // Next weekday after Sunday
    }
}
