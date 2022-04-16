package com.java.class04;


public class StringExample {
    // If we do addition with string it'll be concatenation
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        String str1 = "Hello";
        String str2 = "Java";

        System.out.println(a); // 10
        System.out.println(a + b); // 30
        System.out.println(str1 + str2); // HelloJava
        System.out.println(str1 + a); // Hello10
        System.out.println(str1 + a + b); // Hello1020 (Left to right)
        System.out.println(a + b + str1); //Hello30 (Left to right)
        System.out.println("a+b"); // It will be considered like a String
        System.out.println("a" + b); // It will be a20 (a is a String and b is a variable of type int)
        System.out.println("a" + b + c); // It will be A2030, because a is like a string
        System.out.println(str1 + a * b); // It will be Hello200, multiplication is priority and then addition.
        // System.out.println(str1 + a - b); It will be error, java can not produce string - int
        // System.out.println(a - b + str1); It will be -10Hello, java recognized integer + integer + string
        System.out.println(str1 + a + b + str2);


    }
}

