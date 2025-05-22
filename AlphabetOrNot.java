//a Program that fetches a character from the user and checks whether it is Alphabetic

import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.print("Enter the Character to check wheather it is a Alphabet or Nah : ");
        String input = inputs.next();

        //a loop to check whether the user entered only one character
        while(input.length() > 1) {
            System.out.println("One Character at a time YOU IDIOT!");
            input = inputs.next();
        }

        //Scanner takes the input as String hence the type change
        char check = input.charAt(0);

        //a if-else statement that uses ASCII values to check if the character is an Alphabet
        if(check >= 'a' && check <= 'z' || check >= 'A' && check <= 'Z') {
            System.out.println("Yes it is.");
        }
        else {
            System.out.println("No its not.");
        }

        //an integer variable that stores the ASCII value of the character
        int ascii = (int)check;
        System.out.println("BTW the ASCII value of the given character is " + ascii);
        inputs.close();
    }
}