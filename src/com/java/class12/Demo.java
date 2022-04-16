package com.java.class12;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;

        while(i <= num){
            if(i % 3 != 0) {
                System.out.println(i);
            }else if (i % 7 == 0) {
                System.out.println(i);
            }
            i++;

        }
    }
}
