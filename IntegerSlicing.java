//a program that slices an integer and finds out the digit places of each numbers(upto 9999)
//this is my old, less efficient version of slicing an integer
//the new version is uploaded as "NewIntegerSlicing.java"

package TrickyLogics_Java;

import java.util.Scanner;

public class IntegerSlicing {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int input = inputs.nextInt();

        while(input<0) {
            System.out.print("Enter a Positive Integer : ");
            input = inputs.nextInt();
        }

        int thousands = input/1000;
        int hundreds = (input%1000)/100;
        int tens = (input%100)/10;
        int ones = input%10;
        if(input > 1000) {
            System.out.println("Thousands Place : " + thousands);
        }
        if(input > 100) {
            System.out.println("Hundreds Place : " + hundreds);
        }
        if(input > 10) {
            System.out.println("Tens Place : " + tens);
        }
        if(input >= 0) {
            System.out.println("Ones Place : " + ones);
        }
        inputs.close();
    }
}