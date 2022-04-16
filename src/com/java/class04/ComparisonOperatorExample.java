package com.java.class04;


public class ComparisonOperatorExample {
    public static void main(String[] args) {
        int a=10, b=12, c=10, d=8;

        System.out.println(a == b); // False
        System.out.println(a<b); // True
        System.out.println(a>b); // False
        System.out.println(a<c); // False
        System.out.println(a>=c); // True
        System.out.println(a<=b); // True
        System.out.println(a<=c); // True
        System.out.println(a != b); // True
        System.out.println(b<=c); // True
        System.out.println(b>=d); // True
        System.out.println(a != c); // False
    }
    

}
