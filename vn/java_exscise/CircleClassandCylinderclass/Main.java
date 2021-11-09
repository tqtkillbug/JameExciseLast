package com.java_exscise.CircleClassandCylinderclass;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setRadius(5);
        circle1.setColor("Red");
        System.out.println(circle1);
        Cyinder cyinder1 = new Cyinder();
        cyinder1.setRadius(3);
        cyinder1.setHeight(4);
        cyinder1.setColor("Blue");
        System.out.println(cyinder1);
    }
}
