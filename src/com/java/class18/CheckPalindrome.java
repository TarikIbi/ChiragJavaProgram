package com.java.class18;

import java.util.Scanner;

// Write a program to check given String is palindrome or not
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        isPalindrome(str);
    }

    static void isPalindrome(String str){
        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }

        if(rev.equals(str)) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}


