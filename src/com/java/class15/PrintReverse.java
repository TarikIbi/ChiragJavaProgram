package com.java.class15;

import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {

        System.out.println("Enter any String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = (str.length() - 1); i >= 0; i--){
            System.out.print(str.charAt(i));
        }
    }
}