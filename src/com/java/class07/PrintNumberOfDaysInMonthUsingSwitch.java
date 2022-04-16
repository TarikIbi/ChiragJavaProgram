package com.java.class07;

import java.util.Scanner;

public class PrintNumberOfDaysInMonthUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name of one month");
        String month = sc.nextLine();

        switch (month) {
            case ("January"):
                case ("April"):
            case ("Jun"):
            case ("August"):
            case ("September"):
            case ("November"):
                System.out.println("30");
                break;
            case ("March"):
            case ("May"):
            case ("July"):
            case ("October"):
            case ("December"):
                System.out.println("31");
                break;
            case ("February"):
                System.out.println("28");
                break;


        }
    }
}
