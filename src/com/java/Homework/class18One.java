package com.java.Homework;


import java.util.Scanner;

public class class18One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any word");
        String word = sc.nextLine();
        isPalindrome(word);

    }

    static void isPalindrome(String word) {

        String rev = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            rev = rev + word.charAt(i);
        }

            if (rev.equals(word)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not palindrome");
            }
        }
    }
