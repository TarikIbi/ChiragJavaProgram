package com.java.class09;

public class PrefixAndPostfix {
    public static void main(String[] args) {
        int i = 4; // i = 1 IN THE MEMORY

        int j = 4; // j = 4 in the memory


        int k = i++ + --j;

        int m = k++ + i++;

        // WE HAVE 4 OPERATORS IN THIS STATEMENT: =,+,++ prefix, ++ postfix
        // = IS ASSIGNMENT
        // First we are doing prefix, second we are doing addition.






        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);

    }
}
