package com.java.Homework;

import com.java.class05.ScannerClassExample;

import java.util.Scanner;

public class Classs16One {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any statement");
        String stat = sc.nextLine();
        System.out.println("Which latter we are searching for");
        char latter = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < stat.length(); i++) {
            if (stat.toLowerCase().charAt(i) == latter) {
                count++;
            }

        }
        System.out.println("Number of that latter is " + count );
    }
}
