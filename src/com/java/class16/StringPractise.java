package com.java.class16;

import java.util.Scanner;

public class StringPractise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any word");
        String word = sc.nextLine();

        for (int i = (word.length() - 1); i>=0; i--){
            System.out.print(word.charAt(i));
        }

    }
}
