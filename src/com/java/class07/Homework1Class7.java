package com.java.class07;

import java.util.Scanner;

public class Homework1Class7 {
    public static void main(String[] args) {

        System.out.println("Please enter the app name");

        Scanner sc = new Scanner(System.in);
        String app = sc.nextLine();

        switch(app){
            case ("Gmail"):
            case ("Youtube"):
            case ("Hangouts"):
                System.out.println("Company name is Google");
                break;
            case ("Whatsapp"):
                System.out.println("Company name is Facebook");
                break;
            case ("Skype"):
            case ("Outlook"):
                System.out.println("Company name is Microsoft");
                break;

        }



        }
}
