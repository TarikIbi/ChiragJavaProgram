package com.java.class07;

import java.util.Scanner;

public class Homework3Class7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the character");
        char character = sc.next().charAt(0);

        switch(character){
            case ('a'):
            case ('e'):
            case ('i'):
            case ('o'):
            case ('u'):
                System.out.println("Written character is a vowel");
                break;
            default:
                System.out.println("Written character is not a vowel");
        }
    }
}
