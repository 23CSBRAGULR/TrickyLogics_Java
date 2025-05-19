//a program that uses a reecursive method to find the gcd of a number

import java.util.Scanner;

public class FactorialRecursion {

    public static int factorialCalculation(int num) {
        if(num == 0 || num == 1) {
            return 1;
        }

        return num * factorialCalculation(num - 1);
    }

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter the Number to Find its Factorial Value : ");
        int number = inputs.nextInt();

        System.out.println(factorialCalculation(number));
        inputs.close();
    }
}