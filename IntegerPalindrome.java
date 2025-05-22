//a program that performs integer reversal and check if its a Palindrome

import java.util.Scanner;

public class IntegerPalindrome {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int number = inputs.nextInt();
        String num = "" + number;

        //the following loop reverses the given integer by concatenating the digits in reverse
        int digits = 0;
        String reverse = "";
        while(number != 0) {
            digits = number%10;
            reverse += digits;
            number /= 10;
        }

        System.out.println("Reversed Form : " + reverse);

        if(num.equals(reverse)) {
            System.out.println(num + " is a Palindrome");
        }
        else {
            System.out.println(num + " is Not a Palindrome");
        }
        inputs.close();
    }
}