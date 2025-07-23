//the method I came up with for finding the GCD of any two numbers
//less efficient than Euclidean's method

package TrickyLogics_Java;

import java.util.Scanner;

public class GCD {

    //the method that returns the GCD of two numbers
    //by checking the divisibility of the exact divisors of the smallest number with the largest number
    static int gcdCalculation(int divisors[], int largest) {
        int gcd = 1;
        for(int i = (divisors.length - 1); i >= 0; i--) {
            if(largest % divisors[i] == 0) {
                gcd = divisors[i];
                break;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter the First Number : ");
        int firstNumber = inputs.nextInt();
        System.out.print("Enter the Second Number : ");
        int secondNumber = inputs.nextInt();

        int smallest = Math.min(firstNumber, secondNumber);
        int largest = Math.max(firstNumber, secondNumber);
        
        //a for loop for determining the length of an array
        //which will contain all the exact divisors of the smallest number
        int length = 0;
        for(int i = 1; i <= smallest; i++) {
            if(smallest%i == 0) {
                length++;
            }
        }

        //divisors array creation and insertion
        int divisors[] = new int[length];
        int index = 0;
        for(int i = 1; i <= smallest; i++) {
            if(smallest%i == 0) {
                divisors[index] = i;
                index++;
            }
        }
        int gcd = gcdCalculation(divisors, largest);
        System.out.println("The Greatest Common Divisor(GCD) of " + firstNumber + " and " + secondNumber + " is " + gcd + ".");
        inputs.close();
    }
}