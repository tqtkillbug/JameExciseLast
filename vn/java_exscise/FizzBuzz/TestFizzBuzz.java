package com.java_exscise.FizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFizzBuzz {
    @Test
    public void testFizz(){
        int number = 315;
        String result = FizzBuzzProgram.checkNumber(number);
        String expected = "Fizz";
        assertEquals(expected, result);
    }
    @Test
    public void testBuzz(){
        int number = 131;
        String result = FizzBuzzProgram.checkNumber(number);
        String expected = "Fizz";
        assertEquals(expected, result);
    }
    @Test
    public void testFizzBuzz(){
        int number = 155;
        String result = FizzBuzzProgram.checkNumber(number);
        String expected = "Buzz";
        assertEquals(expected, result);
    }
    @Test
    public void testFaid(){
        int number = 595;
        String result = FizzBuzzProgram.checkNumber(number);
        String expected = "Buzz";
        assertEquals(expected, result);
    }
    @Test
    public void testFaid1(){
        int number = 666;
        String result = FizzBuzzProgram.checkNumber(number);
        String expected = "666";
        assertEquals(expected, result);
    }
}
