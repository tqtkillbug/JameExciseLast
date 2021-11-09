package com.java_exscise.exceptionandebug;

import java.util.Scanner;

public class Triangle {
    public void chekTriangle() {
    Scanner input = new Scanner(System.in);
        System.out.println("Nhap canh a: ");
        int a = input.nextInt();
        System.out.println("Nhap canh b: ");
        int b = input.nextInt();
        System.out.println("Nhap canh c: ");
        int c = input.nextInt();
        if (a + b > c && a + c > b && b+c > a && a > 0 && b > 0 && c > 0){
            System.out.println("La tam giac");
        } else{
        }
    }
}
