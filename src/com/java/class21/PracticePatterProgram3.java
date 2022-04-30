package com.java.class21;

// Interview
public class PracticePatterProgram3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

// Print spaces in each row
            for (int s = 1; s <= 5 - i; s++) {
                System.out.print(" ");
            }
            // Print digits in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = i - 1; k>= 1; k--) {
                System.out.print("*");
            }

            // Print Enter
            System.out.println();
        }
    }
}
