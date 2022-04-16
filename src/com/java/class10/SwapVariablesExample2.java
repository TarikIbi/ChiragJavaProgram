package com.java.class10;

import java.util.Scanner;

public class SwapVariablesExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();
        int c;

        a = b; // WE'RE LOOSING VALUE OF A, SO WE ARE DOING A FIRST.
        a = b;
       //  b = c;


        System.out.println(a);
        System.out.println(b);
    }
}
         // without using third variable
        // a = a +b;
        // b = a - b;
        // a = a - b;

         // without using third variable
         // a = a * b
         // b = a / b
         // a = a / b