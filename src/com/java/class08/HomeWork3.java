package com.java.class08;

// Take a number from user and check if it's divisible by 5 or 3.

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {

        System.out.println("Please enter a number");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 5 == 0 || num % 3 == 0) {
            System.out.println("Number is divisible");
        }else{
            System.out.println("Number is not divisible");
        }
        }
    }

