package com.company;

import java.util.Scanner;
//Program to show perform different operations on numbers
public class Arithmetic {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        System.out.print("Enter the first number : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number : ");
        double num2 = sc.nextDouble();

        System.out.print("Enter the operator (+, -, *, /) : ");
        String op = sc.next();
        //declaring result in double as the result may be in decimal and big
        double result = 0;
        // can't use == operator to compare strings here
        if (op.equals("+")){
            result = num1 + num2;
        }
        else if (op.equals("-")) {
            result = num1 - num2;
        }
        else if (op.equals("*")) {
            result = num1 * num2;
        }
        else if (op.equals("/")) {
            result = num1 / num2;
        }
        System.out.println("The result is " + result);
    }
}
