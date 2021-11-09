package com.java_exscise.Lesson5_Circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public String getColor()    {
        return color;
    }

    public double getRadius() {
        return radius;
    }
}
