package com.java.Homework;


import java.util.Scanner;

public class Class15One {
    public static void main(String[] args) {

        String str1 = "Hello World";
        String str2 = "hello world";
        String str3 = "Hello World! Sta ima ?";

        System.out.println(str1.contains(str3));
        System.out.println("===========================================================");

        String str1L = str1.toLowerCase();
        String str2L = str2.toLowerCase();
        String str3L = str3.toLowerCase();

        System.out.println(str1L.equals(str3L));
        System.out.println("===========================================================");

        System.out.println(str3.toUpperCase());
        System.out.println("===========================================================");

        System.out.println(str1.indexOf('r'));
        System.out.println(str1.lastIndexOf('o'));

        System.out.println(str2.charAt(5));
        System.out.println("===========================================================");

        System.out.println(str3.charAt(11));
        System.out.println("===========================================================");

        System.out.println(str2.length()/2 - 1);
        System.out.println("===========================================================");

        String str2t = " ";

        System.out.println(str2t.isEmpty());
        System.out.println(str2t.isBlank());
        System.out.println("===========================================================");

        str2 = "200 KM 300 KM 400 KM";

        System.out.println(str2.replace("KM", "USD"));
        System.out.println(str2.replaceAll("[0-5]", ""));
        System.out.println("===========================================================");

        str1 = "Sta ima raja, kakvo je stanje u Rajvosa";
        System.out.println(str1.substring(3).trim());
        System.out.println((str1.substring(0,12)));
        System.out.println("===========================================================");

        String address  = "Sarajevo, Soukbunar 53, Kod Rake, Raja iz coska";
        /* String words [] = address.split(",");

        System.out.println(words[0]);
        System.out.println(words[1].trim());
        System.out.println(words[2].trim());
        System.out.println("===========================================================");*/


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = sc.nextLine();

        String words[] = name.split(" ");

        String one = words[0];
        String two = words[1];

        System.out.println(one.charAt(0) + "." + two.charAt(0) + ".");









    }
}
