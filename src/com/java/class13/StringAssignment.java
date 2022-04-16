package com.java.class13;

// Create three String variable ->
// initialize two variable with constant value
// take third variable value frm user using Scanner class
// compare  1st and 2nd using == operator
// compare 2nd and 3rd using == operator
// compare 1st and 3rd using .equals() method

import java.util.Scanner;

public class StringAssignment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = "April";
        String str2 = "April";
        String str3 = sc.nextLine();

        if (str1 == str2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (str2 == str3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (str1.equals(str3)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}

