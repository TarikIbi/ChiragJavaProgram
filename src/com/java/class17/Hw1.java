package com.java.class17;
// Write a program to find out divisor of given number

import java.util.Scanner;

public class Hw1 {

    public static void main(String[] args) {
        // Take number from user
        System.out.println("Please enter number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){ // gets executed 10 times
            if (num % i == 0){ // this will be true only 4 time
                System.out.println(i); // this will be get executed 4 times
            }
        }

    }
}
