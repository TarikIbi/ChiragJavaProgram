package com.java.class05;


import java.util.Scanner;

public class IfElseExample3 {
    public static void main(String[] args) {
        System.out.println("Enter any number -12");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");

        }
    }
}
