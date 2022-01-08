package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;
// Program to find whether the string is a palindrome or not
// Palindrome is a string like 'abba'; reads the same from both sides
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string to check for palindrome: ");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        //i points to at the start, j points at the end of the string
        int i = 0, j = str.length()-1;
        String flag = "true";
        // we only check till the middle character of the string
        while(i<j){
            if ( str.charAt(i) != str.charAt(j)){
                flag = "false";
                break;
            }
            i++;
            j--;
        }
        if (flag.equals("true")){
            System.out.println("The string is a palindrome");
        }
        else {
            System.out.println("It is not a palindrome");
        }

    }
}
