package com.java.class06;

// If your brother have 18+ years, he can bring you in, if not, both of you need to go back.

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner si = new Scanner(System.in);

        System.out.println("Please tell me how old are you");
        int age = si.nextInt();

        if(age >= 18) {
            System.out.println("You can go in");
        }else{
            System.out.println("You need to go back");
        }
    }

}
