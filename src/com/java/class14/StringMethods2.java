package com.java.class14;

import java.util.Locale;

public class StringMethods2 {
    public static void main(String[] args) {

        String str1 = "Hello World";
        String str2 = "hello World";
        String str3 = "Hello World! Welcome to devX!";

        // 1. Check equality of two String
        System.out.println("1. Equality: " + str1.equals(str2));
        System.out.println("================================================================");

        // 2. Check equality of two String ignoring case

        System.out.println("2. Equality ignoring case: " + str1.equalsIgnoreCase(str2));

        // Contains will check one string contains another string considering case-sensitive

        // 3. Check one String contains another String
        System.out.println("3. Contains: " + str1.contains(str3));
        System.out.println("=================================================================");

        // If we want to check one String contains another Sting ignoring case then we have to change.
        // Both String in same case and then check contains, so it'll check only content of both String

        String str3LowerCase = str3.toLowerCase();
        String str2LowerCase = str2.toLowerCase();

        System.out.println("3.1 Contains: " + str3LowerCase.contains(str2LowerCase));
        System.out.println("=================================================================");

        //  4. Check one String contains another String
        System.out.println("4. Upper Case: " + str3.toUpperCase());

        System.out.println("4. Lower Case: " + str3.toLowerCase());
        System.out.println("=================================================================");

            // 5. Find index of character
        str1 = "Hello World";
        str3 = "Hello World! Welcome to devX!";
        System.out.println("5. Index of Char: "  + str1.indexOf('W'));
        System.out.println("5. Last Index of Char: " + str3.lastIndexOf('W'));
        System.out.println("=================================================================");

        // 6. Find character at index
        str1 ="Hello World";
        System.out.println("6. Index of Char: "  + str1.charAt(0));
        System.out.println("=================================================================");

        // 7. Length of String
        str1 = "Hello World";
        str3 = "Hello World! Welcome to devX!";
        System.out.println("7. Length of String: " + str1.length());
        System.out.println("7. Length of string: " + str3.length());
        System.out.println("=================================================================");

        // 8. Empty and Blank
        str1 = "               ";
        str3 = "d";
        System.out.println("8. Empty: " + str1.isEmpty());
        System.out.println("8. Empty: " + str3.isEmpty());
        System.out.println("8. Blank: " + str1.isBlank());
        System.out.println("8. Blank: " + str3.isBlank());
        System.out.println("=================================================================");

        // 9. Replace & ReplaceAll
        str1 = "PRICE IS INR 200 INR 300 INR 500";
        str3 = "DevX";
        System.out.println("9. Replace " + str1.replace("INR", "USD"));
        System.out.println("9. Replace " + str1.replaceAll("[0-9]", ""));
        System.out.println("=================================================================");


        // 10. Format
        str1 = "Welcome %s, Welcome to %s";
        System.out.println("10. Format: " + String.format(str1, "Chirag", "Ebay"));
        System.out.println("=================================================================");


        // 11. SubString
        str1 = "Welcome to java class. Today is fun day";

        System.out.println("11. SubString: " + str1.substring(7));
        System.out.println("11. SubString: " + str1.substring(0,8));
        System.out.println("=================================================================");

        // 12. Split
       /*str1 = "Welcome to jva class";
        String[] words = str1.split(" ");
        System.out.println("12. Split: " + words[0]);*/

        str1 = "Welcome to java class. Today is fun day";
        String[] words = str1.split(" ");

        /*for(int i = 0; i <= 3; i++) {
            System.out.println(words[i]);*/

        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }

        /*System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words [3]);*/





    }
}

