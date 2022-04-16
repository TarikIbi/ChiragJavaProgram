package com.java.class07;

// tAKE A PRICE FROM USER AND PRINT DISCOUNT VALUE BASED ON PRICE

// less than 100 then print - No Discount
// less than 500 then print - 5%
// less than 1000 then print - 10%
// less than 1000 then print - 15%


import java.util.Scanner;

public class PrintDiscountBasedOnPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price");
        int price = sc.nextInt();

        if(price < 100) {
            System.out.println("No Discount");
        }else if(price < 500) {
            System.out.println("5% discount");
        }else if(price < 1000) {
            System.out.println("10% discount");
        }else if(price >= 1500){
            System.out.println("15% discount");
        }
    }

}
