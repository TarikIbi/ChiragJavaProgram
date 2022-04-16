package com.java.class08;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter T-shirt size in inches");

        int inc = sc.nextInt();

        if(inc >= 27 && inc <= 30) {
            System.out.println(" Your size is XS");
        }else if (inc >= 31 && inc <= 34) {
            System.out.println("Your size is S");
        }else if (inc >= 35 && inc <= 38) {
            System.out.println("Your size is L");
        }else if (inc >= 39 && inc <= 42) {
            System.out.println("Your size is XL");
        }else if (inc >= 45 && inc <= 50){
            System.out.println("Your size is XXL");
        }
    }
}
