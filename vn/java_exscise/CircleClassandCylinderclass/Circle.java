package com.java_exscise.CircleClassandCylinderclass;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color, boolean filled) {
    }

    public Circle(double radius) {
    }

    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        double area = radius*radius * Math.PI;
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius= " + radius +
                ", color= '" + color + '\'' +
                 "Area= " + getArea()+'}';
    }

}
   class Cyinder extends Circle{
    private double height;

       public double getHeight() {
           return height;
       }

       public void setHeight(double height) {
           this.height = height;
       }
       public double getVolume(){
           double volume = getArea() * height;
           return volume;
       }

       @Override
       public String toString() {
           return "Cyinder{" +
                   " Radius: " + getRadius() +
                   " height= " + getHeight() +
                   " Area: " + getArea()+
                   " Volume= " + getVolume()+
                   " color:" + getColor()+
                   '}';
       }


   }

