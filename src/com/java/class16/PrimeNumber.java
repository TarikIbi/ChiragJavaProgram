package com.java.class16;

import java.util.Scanner;

// Write a program to check given number is prime or not
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 != 0) {
            if(num/1==num )
            System.out.println("It's a prime number");
        }else{
            System.out.println("It's not a prime number");

        }
    }
}
