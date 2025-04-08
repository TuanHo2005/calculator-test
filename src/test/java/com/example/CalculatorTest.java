package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator cal = new Calculator();
        Assert.assertEquals(cal.add(2, 3), 5);
    }

    @Test
    public void testSubtract() {
        Calculator cal = new Calculator();
        Assert.assertEquals(cal.subtract(5, 2), 3);
    }
}
