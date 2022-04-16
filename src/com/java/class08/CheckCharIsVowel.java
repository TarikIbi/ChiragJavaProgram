package com.java.class08;

import java.util.Scanner;

// TAKE SINGLE CHARACTER IN THE PROGRAM & CHECK WEATHER GIVEN CHARACTER IS VOWEL OR NOT
public class CheckCharIsVowel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        if(c == 'a'|| c == 'e'|| c == 'i'|| c == 'o'|| c == 'u'){
            System.out.println(" Character is Vowel");
        }else{
            System.out.println("Character is not vowel");
        }

    }
}
