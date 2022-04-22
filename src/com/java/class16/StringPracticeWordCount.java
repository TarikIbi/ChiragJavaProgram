package com.java.class16;
// Write a program to takee one statement from user and find out numbers of words
// We have inside the statement

// Example input - Hello, this is my first java program
// Output - 8

import java.util.Scanner;

public class StringPracticeWordCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any statement");
        String stat = sc.nextLine();

        String words[] = stat.split(" ");
        System.out.println(words.length);

    }
}
