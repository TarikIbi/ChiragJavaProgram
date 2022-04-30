package com.java.class21;

//        1
//       12
//      123
//     1234
//    12345

public class PatterProgram3 {
    public static void main(String[] args) {

        for(int i = 1; i <=5; i++){

            for(int s = 1; s<=5-i; s++){
                System.out.print(" ");
            }
            for(int j = 1; j <=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
