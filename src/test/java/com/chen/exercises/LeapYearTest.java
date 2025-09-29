package com.chen.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {

    // 测试2000年：闰年
    @Test
    public void testLeapYear2000() {
        assertTrue(LeapYear.isLeap(2000), "2000 should be a leap year");
    }

    // 测试1900年：平年
    @Test
    public void testLeapYear1900() {
        assertFalse(LeapYear.isLeap(1900), "1900 should not be a leap year");
    }

    // 测试2024年：闰年
    @Test
    public void testLeapYear2024() {
        assertTrue(LeapYear.isLeap(2024), "2024 should be a leap year");
    }

    // 测试2019年：平年
    @Test
    public void testLeapYear2019() {
        assertFalse(LeapYear.isLeap(2019), "2019 should not be a leap year");
    }

    // 测试2100年：平年
    @Test
    public void testLeapYear2100() {
        assertFalse(LeapYear.isLeap(2100), "2100 should not be a leap year");
    }

    // 测试2400年：闰年
    @Test
    public void testLeapYear2400() {
        assertTrue(LeapYear.isLeap(2400), "2400 should be a leap year");
    }
}
