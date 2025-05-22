//the following program reverses any given integer regardless of the number of digits

import java.util.Scanner;

public class ReversingInteger {

    static void reverse(int number, int digits) {
        int divisor = 10;
        int length = digits;
        while(digits > 1) {
            divisor *= 10;
            digits--;
        }
        int numberArray[] = new int[length];
        for(int i = 0; i < length; i++) {
            if(divisor >= 10) {
                numberArray[i] = (number%divisor)/(divisor/10);
                divisor /= 10;
            }
        }
        for(int i = length - 1; i >= 0; i--) {
            System.out.print(numberArray[i]);
        }
    }

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int number = inputs.nextInt();
        int num = number;

        int digits = 0;
        while(num != 0) {
            num /= 10;
            digits++;
        }

        System.out.println("Number of Digits : " + digits);
        System.out.print("Reversed Number : ");
        reverse(number, digits);
        inputs.close();
    }
}