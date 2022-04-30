package com.java.class20;

public class Practice1 {
    public static void main(String[] args) {

        for(int i =5; i<=9 ; i++){
            for(int j = 9; j>=i; j--){
                System.out.print(j);
            }
            System.out.println();
        }


    for(int i = 1; i<=5; i++){
        int k = 5;
        for(int j = 1; j<=6-i; j++){
            System.out.print(k);
            k++;
        }
        System.out.println();
    }
}
}