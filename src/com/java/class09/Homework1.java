package com.java.class09;

public class Homework1 {
    public static void main(String[] args) {

        int i = 4, j = 4, k = 4;
        i=j++;
        j=k++;
        k=--i; // k =
        int m = i + j + k--;


        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
    }

}
