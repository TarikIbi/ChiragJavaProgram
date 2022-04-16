package com.java.class08;

// Take three numbers from users and print maximum number out of three numbers

import java.util.Scanner;

public class maximumOutOfThreeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter three numbers");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a > b && a>c) {
            System.out.println( a + " is maximum number");
        }else if(b>c) {
            System.out.println(b + " is maximum number");
        }else{
            System.out.println(c + " is maximum number");

        }
    }
}


// Check the equality of two numbers. Output need to be example: 45 and 45 are equal.