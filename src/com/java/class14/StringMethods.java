package com.java.class14;



public class StringMethods {
    public static void main(String[] args) {

        String str1 = "Hello World";
        String str2 = "hello World";
        String str3 = "Hello World! Welcome to devX!";

        //  Check equality of two String
        System.out.println(str1.equals(str2));

        //  Check equality of two String ignoring case
        System.out.println(str1.equalsIgnoreCase(str2));

        //  Check one String contains another String
        System.out.println(str1.contains(str3));

        //  Check one String contains another String
        // System.out.println(str3.contains(str1)); - true





    }
}
