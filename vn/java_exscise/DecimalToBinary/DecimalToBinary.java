package com.java_exscise.DecimalToBinary;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        int choice = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number Want Convert To Binary: ");
        int decimalNumber = input.nextInt();
        Stack<Integer> binaryStack = new Stack<>();
        do{
          int remainder = decimalNumber % 2;
          binaryStack.push(remainder);
          decimalNumber = decimalNumber / 2;
          if ((decimalNumber / 2) == 0){
              remainder = decimalNumber % 2;
              binaryStack.push(remainder);
              choice = 1;
          }
      } while (choice == 0);
        Iterator binaryIter = binaryStack.iterator();
       while (binaryIter.hasNext()){
           Object binaryChar = binaryIter.next();
           System.out.print(binaryChar);
       }
    }
}
