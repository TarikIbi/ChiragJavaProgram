package com.java.Homework;

import java.util.Scanner;

public class Class15Two {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter anything");
        String any = sc.nextLine();

        for (int i = (any.length() - 1); i >= 0; i--){
            System.out.println(any.charAt(i));

        }

    }
}
