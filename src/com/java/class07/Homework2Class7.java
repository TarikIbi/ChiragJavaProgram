package com.java.class07;



import java.util.Scanner;

public class Homework2Class7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the character");
        char character = sc.next().charAt(0);

        if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            System.out.println("Vowel");
        }else{
            System.out.println("Written character is not vowel");

        }
    }
}
