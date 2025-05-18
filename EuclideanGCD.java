//a program that finds out the Greatest Common Divisor of any two positive integers using the Euclidean's Mathematical method
//btw there's another kinda inefficient logic for finding the GCD in the program 'GCD.java'

import java.util.Scanner;

public class EuclideanGCD {

    //the method that performs the Euclidean's method of finding the GCD
    static int gcdCalculation(int number1, int number2) {
        int smallest = Math.min(number1, number2);
        int largest = Math.max(number1, number2);
        int difference;
        while(smallest != 0 && largest != 0) {
            difference = largest - smallest;
            largest = Math.max(smallest, difference);
            smallest = Math.min(smallest, difference);
        }
        int gcd = Math.max(smallest, largest);
        return gcd;
    }

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter the First Number : ");
        int firstNumber = inputs.nextInt();
        System.out.print("Enter the Second Number : ");
        int secondNumber = inputs.nextInt();

        int gcd = gcdCalculation(firstNumber, secondNumber);
        System.out.println("The Greatest Common Divisor(GCD) of " + firstNumber + " and " + secondNumber + " is " + gcd + ".");
        inputs.close();
    }
}