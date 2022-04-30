package com.java.class20;

public class Practice2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) { // Rows - Redovi
            for (int j = i ; j <=i +1; j++) { // Columns - Kolone
                System.out.print(j);
            }
            System.out.println();
        }
    }
}