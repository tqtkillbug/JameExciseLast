package com.java_exscise.algorithm_sort;

import java.util.LinkedList;
import java.util.Scanner;

public class EXFindStringLongMax {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Nhập chuỗi: ");
            String string = input.nextLine();

            LinkedList<Character> max = new LinkedList<>();

            for (int i = 0; i < string.length(); i++) { //Vòng lặp bên ngoài
                LinkedList<Character> list = new LinkedList<>();
                list.add(string.charAt(i));
                for (int j = i + 1; j < string.length(); j++) { //vòng lặp bên trong
                    if (string.charAt(j) > list.getLast()) {
                        list.add(string.charAt(j));
                    }
                }
                if (list.size() > max.size()) {
                    max.clear();
                    max.addAll(list);
                }
                list.clear();
            }

            for (Character ch: max) { // 1 vòng lặp
                System.out.print(ch); // 1 câu lệnh
            }
            System.out.println();
        }
}
