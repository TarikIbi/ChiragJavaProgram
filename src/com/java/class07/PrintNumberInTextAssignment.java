package com.java.class07;

// TAke one number form user (o - 9) & print number in text format

// Example input - 1, output - one
// Example input - 7, output - seven


import java.util.Scanner;

public class PrintNumberInTextAssignment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number from 0 to 9");
        int num = sc.nextInt();

        if(num == 0) {
            System.out.println("Zero");
        }else if(num ==1) {
            System.out.println("One");
        }else if(num ==2) {
            System.out.println("Two");
        }else if(num ==3) {
            System.out.println("three");
        }else if(num ==4) {
            System.out.println("Four");
        }else if(num==5) {
            System.out.println("Five");
        }else if(num == 6) {
            System.out.println("Six");
        }else if(num == 7) {
            System.out.println("Seven");
        }else if(num == 8){
            System.out.println("Eight");
        }else if(num == 9){
            System.out.println("Nine");
        }else if(num > 9){
            System.out.println("Invalid number input");
        }else if(num<0){
            System.out.println("Invalid number input");


}
}
}
