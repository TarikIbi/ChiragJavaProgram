package com.java.class05;

import java.util.Scanner;

public class ScannerClassExample3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt(), num2 = sc.nextInt();

        if(num1 > num2) {
            System.out.println(num1 + " Is greater");
        }else{
            if(num2 > num1) {
                System.out.println(num2 + " Is greater");
            }else{
                System.out.println( "equal");
            }
        }
    }
}













