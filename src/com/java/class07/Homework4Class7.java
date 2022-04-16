package com.java.class07;

import java.util.Scanner;

public class Homework4Class7 {
    public static void main(String[] args) {

        // String username = "Tarik";
        //String password = "java class";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your username");
        String username = sc.nextLine();
        System.out.println("Please enter your password");
        String password = sc.nextLine();

        if (username.equals("Tarik") && password.equals("java class")) {
            System.out.println("Login successful");
        } else if (username.equals("Tarik")){
            System.out.println("Invalid password");
        }else if(password.equals ("java class")) {
            System.out.println("Invalid username");
        }else{
            System.out.println("Login unsuccessful");
            }
        }



        }

