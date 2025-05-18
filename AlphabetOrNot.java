import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.print("Enter the Character to check wheather it is a Alphabet or Nah : ");
        String input = inputs.next();

        while(input.length() > 1) {
            System.out.println("One Character at a time YOU IDIOT!");
            input = inputs.next();
        }

        char check = input.charAt(0);

        if(check >= 'a' && check <= 'z' || check >= 'A' && check <= 'Z') {
            System.out.println("Yes it is.");
        }
        else {
            System.out.println("No its not.");
        }

        int ascii = (int)check;
        System.out.println(ascii);
    }
}