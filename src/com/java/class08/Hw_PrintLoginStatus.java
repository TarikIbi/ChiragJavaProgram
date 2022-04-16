package com.java.class08;

import java.util.Scanner;

public class Hw_PrintLoginStatus {

    public static void main(String[] args) {
        // Input
        System.out.println("Please enter username & password");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine(), password = sc.nextLine();
        String expUsername = "DevX", expPassword = "Spring2022"; // DataBase

        // Output
        // When we type correct username and password java will give us answer "Login unsuccessful"
        // because we can not use == for string.
        if (username == expUsername && password == expPassword) {
            System.out.println("Login successful");
        } else if (username != expUsername && password != expPassword) {
            System.out.println("Login unsuccessful");
        } else if (username != expUsername && password == expPassword) {
            System.out.println("Invalid password");
        } else {
            System.out.println("Invalid username");


        }
    }
}
