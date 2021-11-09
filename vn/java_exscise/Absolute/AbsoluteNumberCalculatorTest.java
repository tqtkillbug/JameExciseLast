package com.java_exscise.Absolute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {
    @Test
    void testFindAbsolute0() {
        int number = 0;
        int expected = 0;
        int result = AbsoluteNumberCalculator.findAbsoluteNumber(number);
        assertEquals(expected, result);
    }
  @Test
    void testFindAbsolute1() {
        int number = 1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAbsoluteNumber(number);
        assertEquals(expected, result);
    }
    @Test
    void testFindAbsolute2() {
        int number = 2;
        int expected = 2;
        int result = AbsoluteNumberCalculator.findAbsoluteNumber(number);
        assertEquals(expected, result);
    }
    @Test
    void testFindAbsolute3() {
        int number = -10;
        int expected = 10;
        int result = AbsoluteNumberCalculator.findAbsoluteNumber(number);
        assertEquals(expected, result);
    }
    @Test
    void testFindAbsolute4() {
        int number = -102;
        int expected = 102;
        int result = AbsoluteNumberCalculator.findAbsoluteNumber(number);
        assertEquals(expected, result);
    }
}