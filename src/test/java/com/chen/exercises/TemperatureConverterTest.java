package com.chen;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TemperatureConverterTest {
    @Test
    void zeroCelsiusIs32F() {
        assertEquals(32.0, TemperatureConverter.cToF(0.0), 1e-9);
    }
}
