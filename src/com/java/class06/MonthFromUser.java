package com.java.class06;

import java.util.Scanner;

public class MonthFromUser {
    public static void main(String[] args) {

        // How many days we have in each month

        System.out.println("Please chose month by numbers from 1 to 12");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("31 days in January");
        } else if (num == 2) {
            System.out.println("29 days in February");
        } else if (num == 3) {
            System.out.println("31 days in March");
        } else if (num == 4) {
            System.out.println("30 days in April");
        } else if (num == 5) {
            System.out.println("31 days in May");
        } else if (num == 6) {
            System.out.println("30 days in Jun");
        } else if (num == 7) {
            System.out.println("31 days in July");
        }else if(num == 8) {
            System.out.println("31 days in August");
        }else if(num == 9) {
            System.out.println("30 day in September");
        }else if(num == 10) {
            System.out.println("31 days in October");
        }else if(num == 11) {
            System.out.println("30 days in November");
        }else if(num == 12){
            System.out.println("31 days in December");



        }
    }
}
