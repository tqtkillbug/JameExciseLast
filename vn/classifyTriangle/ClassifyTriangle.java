package com.classifyTriangle;

public class ClassifyTriangle {


    public static String checkTriange(double a, double b , double c){
        if(a+b > c && a+c > b && b+c > a){
            if (a == b && b == c){
                return "Tam Giac Deu";
            } else{
                if (a == b || a == c || b == c){
                    return "Tam Giac Can";
                } else {
                    return "Tam Giac Thuong";
                }
            }
        } else {
            return "Khong phai la tam giac";
        }
    }
}
