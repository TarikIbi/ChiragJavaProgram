package com.java.class15;

import java.util.Scanner;

public class PrintInitials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your fullName");
        String fullName = sc.nextLine();
        String words[] = fullName.split(" ");

        String firstName = words[0];
        String lastName = words[1];
        String middleName = words[2];

        System.out.println(firstName.charAt(0) + "." + middleName.charAt(0) + "." + lastName.charAt(0) + ".");

    }
}

