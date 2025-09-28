package com.chen.exercises;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {
    // 测试零温度
    @Test
    void zeroCelsiusIs32F() {
        assertEquals(32.0, TemperatureConverter.cToF(0.0), 1e-9);

    }

    // 测试正温度
    public void testPositiveTemperature() {
        double celsius = 25;
        double expectedFahrenheit = 77.0;
        double actualFahrenheit = TemperatureConverter.cToF(celsius);
        assertEquals(expectedFahrenheit, actualFahrenheit, 0.01, "25°C should be 77°F");
    }
    // 测试负温度
    @Test
    public void testNegativeTemperature() {
        double celsius = -10;
        double expectedFahrenheit = 14.0;
        double actualFahrenheit = TemperatureConverter.cToF(celsius);
        assertEquals(expectedFahrenheit, actualFahrenheit, 0.01, "-10°C should be 14°F");
    }
    // 测试非数字输入（捕获异常）
    @Test
    public void testInvalidInput() {
        try {
            double invalidInput = Double.parseDouble("abc"); // 模拟非数字输入
            TemperatureConverter.cToF(invalidInput); // 调用转换函数
            fail("Expected exception for non-numeric input"); // 如果没有抛出异常，则测试失败
        } catch (NumberFormatException e) {
            // 异常捕获成功，测试通过
            assertTrue(true);
        }
    }

}
