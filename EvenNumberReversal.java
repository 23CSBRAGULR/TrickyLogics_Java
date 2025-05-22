//the following program reverses the positions of only the even numbers in the given number
//this program contains some amateur ways for solving problems

import java.util.Scanner;

public class EvenNumberReversal {

    //a method that counts and returns the number of a given number
    static int digitCount(int number) {
        int digitCount = 0;
        while(number != 0) {
            number /= 10;
            digitCount++;
        }
        return digitCount;
    }

    //a method that slices each and every digits of a number and stores it in an array
    static int[] digitSlicing(int number) {
        int digitCount = digitCount(number);
        int digits[] = new int[digitCount];
        
        int divisor = 1;
        for(int i = 1; i <= digitCount; i++) {
            divisor *= 10;
        }
        //I could've just used 10^digits instead the previous for loop, but I complicated it like an amateur

        for(int i = 0; i < digitCount; i++) {
            digits[i] = (number%divisor)/(divisor/10);
            divisor /= 10;
        }

        return digits;
    }

    //the method that reverses all the even numbers and prints the result
    static void reversal(int number) {

        int num[] = digitSlicing(number);
        
        //the following for loop is just for determining the length of the Even number array
        //as I'm not familier with arraylists, yet
        int evenCount = 0;
        for(int i = 0; i < num.length; i++) {
            if(num[i] % 2 == 0) {
                evenCount++;
            }
        }
        int pos[] = new int[evenCount];

        //insertion
        int index = 0;
        for(int i = 0; i < num.length; i++) {
            if(num[i] % 2 == 0) {
                pos[index] = i;
                index++;
            }
        }

        System.out.print("After Reversing evens\t: ");

        //two variables with maximum and minimum indices of the even number array
        int maxIndex = pos.length - 1;
        index = 0;
        //for everytime the value of i is equal to the value of even number array at the "index" index, the value at the "maxIndex" will be printed
        //followed by the minimum index's increment and maximum index's decrement
        //and the else block just prints the remaining numbers
        for(int i = 0; i < num.length ; i++) {
            if(i == pos[index]) {
                System.out.print(num[pos[maxIndex]]);
                maxIndex--;
                if(index + 1 < pos.length) {
                    index++;
                }
            }
            else {
                System.out.print(num[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter the number\t: ");
        int number = inputs.nextInt();

        //a loop that checks for the eligibility of the input
        while(number < 0) {
            System.out.print("Enter a Valid Number\t: ");
            number = inputs.nextInt();
        }

        //printing the given number for clarity
        System.out.println("\nOriginal Number\t\t: " + number);
        reversal(number);
        inputs.close();
    }
}