package com.java.class21;

public class FindSumOfEachDigitOfNumber {
    public static void main(String[] args) {

        int num = 326;
        int sum = 0;

        // output = 10

        while(num > 0 ){
            sum = sum + num % 10;
            num = num / 10;


        }
        System.out.println(sum);
    }
}
