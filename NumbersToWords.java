//the program that fetches a number from the user then returns the number's words using a logic

import java.util.Scanner;

public class NumbersToWords {

    //the method that contains and returns the array of number's names upto twenty
    String uptoTwenty(int input) {
        String uptoTwenty[] = {
            "One", "Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty"
        };
        return uptoTwenty[input - 1];
    }

    //the method that contains and returns the array of number's names of tens places
    String tens(int input) {
        String tens[] = {
            "Ten", "Twenty", "Thirty", "Forty", "Fifty",
            "Sixty", "Seventy", "Eighty", "Ninety"
        };
        return tens[input - 1];
    }

    public static void main(String[] args) {
        NumbersToWords ob = new NumbersToWords();
        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int input = inputs.nextInt();

        //a while loop that checks if the number is under the 10000 limit
        while(input >= 10000 || input <= -10000) {
            System.out.print("Enter a Valid Number between Positive and Negative 10000 : ");
            input = inputs.nextInt();
        }

        //the statement that checks whether the given number is a negative integer
        boolean negativity = false;
        if(input < 0){
            negativity = true;
            input = -input;
        }

        String finalWords = "";
        int thousands = input/1000;
        int hundreds = (input%1000)/100;
        int tens = (input%100)/10;
        int ones = input%10;
        int teens;
        boolean uptoTwenty = false;

        if(input > 1000) {
            if(hundreds > 0) {
                finalWords += ob.uptoTwenty(thousands) + " Thousand ";
            }
            else {
                finalWords += ob.uptoTwenty(thousands) + " Thousand and ";
            }
        }
        if(input >= 100) {
            if(hundreds > 0 && (tens != 0 || ones != 0)) {
                finalWords += ob.uptoTwenty(hundreds) + " Hundred and ";
            }
            else if (hundreds > 0) {
                finalWords += ob.uptoTwenty(hundreds) + " Hundred";
            }
        }
        if(input >= 10) {
            teens = input%100;
            if(teens > 10 && teens < 20) {
                uptoTwenty = true;
                finalWords += ob.uptoTwenty(tens + 10) + " ";
            }
            else if (tens > 0) {
                finalWords += ob.tens(tens) + " ";
            }
        }
        if(input > 0 && uptoTwenty == false) {
            if(ones > 0) {
                finalWords += ob.uptoTwenty(ones); 
            }
        }
        if(input == 0) {
            finalWords = "Zero";
        }

        finalWords = finalWords.trim();
        if(negativity) {
            System.out.println("Minus " + finalWords + ".");
        }
        else {
            System.out.println(finalWords + ".");
        }

        inputs.close();
    }
}