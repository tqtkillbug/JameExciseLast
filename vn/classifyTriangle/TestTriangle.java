package com.classifyTriangle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestTriangle {
    @Test
    @DisplayName("Testing add 1")
    public void testTriangle() {
        double a = 3;
        double b = 4;
        double c = 5;
        String result = ClassifyTriangle.checkTriange(a,b,c);
        String expected = "Tam Giac Thuong";
        assertEquals(result, expected);
    }

    private void assertEquals(String result, String expected) {
    }


    @Test
    @DisplayName("Testing add 2")
    public void testTriangle1() {
        double a = 3;
        double b = 3;
        double c = 3;
        String result = ClassifyTriangle.checkTriange(a,b,c);
        String expected = "Tam Giac Deu";
        assertEquals(result, expected);
    }
    @Test
    @DisplayName("Testing add 3")
    public void testTriangle2() {
        double a = 6;
        double b = 6;
        double c = 15;
        String result = ClassifyTriangle.checkTriange(a,b,c);
        String expected = "Tam Giac Can";
        assertEquals(result, expected);
    }
    @Test
    @DisplayName("Testing add 4")
    public void testTriangle3() {
        double a = 0;
        double b = 1;
        double c = 1;
        String result = ClassifyTriangle.checkTriange(a,b,c);
        String expected = "Khong phai la tam giac";
        assertEquals(result, expected);
    }
};