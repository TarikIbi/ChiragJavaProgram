package com.java.class19;

public class PrintPatterSquare2 {
    public static void main(String[] args) {

        for(int i = 1; i<=5; i++){ // Number of rows
            for(int j = 1; j <= 5; j++){ // Columns
                System.out.print('*');

            }
            System.out.println();
            for(int j = 1; j <= 5; j++){
                System.out.print("&");
            }
            System.out.println();
        }
    }
}
