//a program that finds the Least Common Multiple of any two numbers

import java.util.Scanner;

public class LCM {

    //the method that returns the GCD of the two numbers
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

    //the method that returns the LCM by using the Mathematical logic--
    //"Product of the two numbers divided by the gcd of the two numbers"
    static int lcmClaculation(int number1, int number2, int gcd) {
        int lcm = (number1*number2) / gcd;
        return lcm;
    }

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int firstNumber = inputs.nextInt();
        System.out.print("Enter the second number : ");
        int secondNumber = inputs.nextInt();

        int gcd = gcdCalculation(firstNumber, secondNumber);
        int lcm = lcmClaculation(firstNumber, secondNumber, gcd);

        System.out.println("The LCM of " + firstNumber + " and " + secondNumber + " is " + lcm);
        inputs.close();
    }
}