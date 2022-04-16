package com.java.class07;

// TAke one number form user (o - 9) & print number in text format

// Example input - 1, output - one
// Example input - 7, output - seven

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number from 0 to 9");
        int num = sc.nextInt();

        switch (num) {
            default:
                System.out.println("Please enter number from 0 to 9");
                break;
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five ");





        }

    }
}
