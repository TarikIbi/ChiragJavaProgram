package com.java.class06;

import java.util.Scanner;

// Write a program to check abilities of some person to do bungee jumping(age,weight,level of stress)
public class Exercise1 {
    public static void main(String[] args) {

        Scanner is = new Scanner(System.in);
        System.out.println("Please tell me your age");
        int age = is.nextInt();

        System.out.println("Please tell me how many pounds you have");
        int weight = is.nextInt();

        System.out.println("Please tell me what is you level of stress");
        int stress = is.nextInt();

        if (age >= 18) {
            if (weight >= 60) {
                if (stress < 6) {
                    System.out.println("You can do jumping");
                } else {
                    System.out.println("You can not do jumping because of weight and stress level");
                }
            }
        } else if (weight >= 60) {
            System.out.println("You need to grow up");
        } else {
            System.out.println("You don't have enough weight");
        }if(stress > 6){
            System.out.println("You need to speak with doctor");
        }
        }
    }














