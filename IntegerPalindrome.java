//a program that performs integer reversal and check if its a Palindrome

import java.util.Scanner;

public class IntegerPalindrome {

    //the method that checks if the given integer is a Palindrome
    static boolean ifPalindrome(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int number = inputs.nextInt();
        String num = "" + number;

        int digits = 0;
        String reverse = "";
        while(number != 0) {
            digits = number%10;
            reverse += digits;
            number /= 10;
        }

        System.out.println("Reversed Form : " + reverse);

        if(ifPalindrome(num, reverse)) {
            System.out.println(num + " is a Palindrome");
        }
        else {
            System.out.println(num + " is Not a Palindrome");
        }
        inputs.close();
    }
}