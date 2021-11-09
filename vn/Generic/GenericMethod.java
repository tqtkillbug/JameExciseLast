package com.Generic;

public  class GenericMethod {

    public static <E> void printArra(E[] elements) {

        for (E element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = { 10, 20, 30, 40, 50 };
        Character[] charArray = { 'C', 'O', 'D', 'E', 'G','Y','M' };

        System.out.print("Print Integer Array: ");
      printArray(intArray);
        System.out.print("Print String Array: ");
    }

    private static void printArray(Integer[] intArray) {
    }
}