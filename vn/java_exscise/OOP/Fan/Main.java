package com.java_exscise.OOP.Fan;

public class Main {
    public static void main(String[] args) {
        Fan Fan1 = new Fan();
        Fan1.setSpeed(Fan1.FAST);
        Fan1.setColor("Yellow");
        Fan1.setOn(true);
        Fan1.setRadius(10);
        Fan Fan2 = new Fan();
        Fan1.setSpeed(Fan1.MEDIUM);
        Fan1.setRadius(5);
        System.out.println(Fan1.toString());
        System.out.println(Fan2.toString());
    }
}
