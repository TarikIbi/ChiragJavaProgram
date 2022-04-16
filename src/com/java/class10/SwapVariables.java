package com.java.class10;


public class SwapVariables {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int c;

        c = a; // WE'RE LOOSING VALUE OF A, SO WE ARE DOING A FIRST.
        a = b;
        b = c;


        System.out.println(a);
        System.out.println(b);
    }
}
