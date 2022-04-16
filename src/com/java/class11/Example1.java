package com.java.class11;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int limit = sc.nextInt();

            int i = 1;  // Initialisation

            while (i <= limit/2){   // Condition
                System.out.println(11 - i);
                System.out.println(i);
                i++;  // Increment/Decrement
            }
    }
}
