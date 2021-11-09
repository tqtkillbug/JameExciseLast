package com.java_exscise.FizzBuzz;

public class FizzBuzzProgram {
    public static String checkNumber(int number) {
        String str = String.valueOf(number);
        for (int i = 0; i < str.length(); i++) {
            char cr = str.charAt(i);
            if (Character.toString(cr).equals("3")) {
                return "Fizz";
            }
            if (Character.toString(cr).equals("5")) {
                return "Buzz";
            }
        }
        return String.valueOf(number);
    }
}
//    public static String checkFizzBuzz(int number) {
//        if (number % 3 == 0 && number % 5 == 0) {
//            return "FizzBuzz";
//        } else {
//            if (number % 3 == 0) {
//                return "Fizz";
//            }
//            if (number % 5 == 0) {
//                return "Buzz";
//            }
//        }
//        return String.valueOf(number);
//    }
//}
