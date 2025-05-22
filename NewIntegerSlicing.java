//a new Integer Slicing program that slices a number regardless of the number of digits
//and prints the digit names

import java.util.Scanner;

public class NewIntegerSlicing {

    //a public array that contains most of the digit names
    public static String digitNames[] = {
        "Ones", "Tens", "Hundreds", "Thousands", "Ten Thousads", "Lakhs", "Ten Lakhs", "Crores", "Ten Crores"
    };

    //a method that counts and returns the number of digits of a number
    static int digitCount(int number) {
        int digitCount = 0;
        while(number != 0) {
            number /= 10;
            digitCount++;
        }
        return digitCount;
    }

    //the method that slices and stores all the digits in an array individually
    static int[] digitSlicing(int number, int digitCount, int divisor) {
        int digits[] = new int[digitCount];
        for(int i = 0; i < digitCount; i++) {
            digits[i] = (number%divisor)/(divisor/10);
            divisor /= 10;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int number = inputs.nextInt();
        
        int digitCount = digitCount(number);
        int divisor = (int)(Math.pow(10, digitCount));
        int digits[] = digitSlicing(number, digitCount, divisor);

        //printing the digit names respective to the digits
        int digit = 0;
        for(int i = digits.length - 1; i >= 0; i--) {
            System.out.println(digits[digit] + " : " + digitNames[i]);
            digit++;
        }
        inputs.close();
    }
}