package com.java.class16;

import java.util.Locale;
import java.util.Scanner;

public class FindOccurrenceOfChar {

    // Write a program to take one String from user and print
    // occurrence of given char in String

    public static void main(String[] args) {
        System.out.println("Please enter a sentence");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Which latter we are searching for");
        char latter = sc.next().charAt(0);

        int count = 0;
        for(int i = 0; i < str.length(); i ++){
            if(str.toLowerCase().charAt(i) == latter){
                count++;

            }
        }
        System.out.println(count);
    }
}
