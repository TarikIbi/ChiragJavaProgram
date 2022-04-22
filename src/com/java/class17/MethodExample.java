package com.java.class17;

import java.util.Scanner;

public class MethodExample {

    static void printLine(int length, char c){

        for(int i = 1; i <= length; i++ ){
            System.out.print(c);
        }
        System.out.println();
    }

    /*public static void printLine(){
        System.out.println("*********************************************");

        }*/


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printLine(30, '=');
        System.out.println("Please enter first number");
        printLine(30, '=');
        int a = sc.nextInt();

        printLine(40, '*');
        System.out.println("Please enter second number");
        printLine(40, '*');
        int b = sc.nextInt();


        printLine(50, '/');
        System.out.println("Please enter the operation Add / Div / Sub / Mul");
        printLine(50, '/');
        String operation = sc.next();


        switch (operation.toLowerCase()){
            case "add":
                System.out.println(a + b);
                break;
            case "div":
                System.out.println(a / b);
                break;
            case "sub":
                System.out.println(a - b);
                break;
            case "mul":
                System.out.println(a * b);
                break;
            default:
                System.out.println(" Invalid operator chosen");
        }
    }
}
