package com.java.class06;
// Write a program when user enter any number from 0 to 6
// print days of week
// 0 / Sunday, 1 - Monday, 2 - Tue .....

import java.util.Scanner;

public class LadderIfElseExample {
    public static void main(String[] args) {
        // Input
        System.out.println("Enter ny number from 0 to 6: ");
        Scanner sc = new Scanner(System.in);
        int daynum = sc.nextInt();

        // Output
        if (daynum == 0){
        System.out.println("Sun");
    }else if(daynum == 1){
            System.out.println("Mon");
        }else if(daynum == 2){
            System.out.println("Tue");
        }else if(daynum == 3){
            System.out.println("Wed");
        }else if(daynum == 4){
            System.out.println("Thu");
        }else if(daynum == 5){
            System.out.println("Fri");
        }else if(daynum == 6){
            System.out.println("Sat");
        }else{
            System.out.println("Please enter number from 0 to 6");
        }

    }
}
