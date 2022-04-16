package com.java.class12;

public class ForLoopExample {
    public static void main(String[] args) {
         // initialization

        for (int i = 1; i <= 10; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        // Another way
        for(int i = 2; i <= 10; i = i+2){
            System.out.println(i);
        }
        // Another way
        for(int i = 2; i <= 10; ++i){
            System.out.println(i*2);
        }
    }
}
