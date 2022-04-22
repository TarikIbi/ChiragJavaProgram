package com.java.Homework;

import com.java.class18.MergeTwoWords;

import java.util.Scanner;

public class class18Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two words");
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        new MergeTwoWords().printMerge(word1,word2);
        System.out.println(printMerge(word1, word2));

        }
static String printMerge (String word1, String word2){

        String newStr = "";

        if(word1.length() > 3 || word2.length() > 3) {
            System.out.println("Incorrect input");
        }else{
            for(int i = 0; i < word2.length(); i++){
                newStr = newStr + word1.charAt(i) + word2.charAt(i);
            }
        }

    return newStr;

}
    }

