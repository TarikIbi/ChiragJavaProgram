package Exercise.exercise;


public class class04 {
    public static void main(String[] args) {
        int a=30, b=15, c=10;
        String str1 = "Hello";
        String str2 = "Tarik";

        System.out.println(a==b); // false
        System.out.println(a != b); // true
        System.out.println(a > c); // true
        System.out.println(b > a); // false
        System.out.println(a >= b); // true
        System.out.println(b <= a); // true

        System.out.println(str1 + a + c); // Hello3010
        System.out.println(c + b + str1); // 25Hello
        System.out.println(str1 + a / c); // Hello3
        System.out.println(a * b + str2 ); // 450Tarik
        System.out.println("b" + a); // b30
        System.out.println(a - c + str2); // 20Tarik
        System.out.println(str2 + a + c); // Tarik3010
      //  System.out.println(str1 + a - c); It will be error because java can not recognize this




    }
}
