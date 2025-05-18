import java.util.Scanner;

public class IsAlphaLibrary {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.print("Enter the Character to check if its an Alphabet : ");
        String input = inputs.next();

        while(input.length() > 1) {
            System.out.print("Enter One Character at a time : ");
            input = inputs.next();
        }

        char check = input.charAt(0);

        if(Character.isAlphabetic(check)) {
            System.out.println("Yes, it is an Alphabet.");
        }
        else {
            System.out.println("No, its not an Alphabet.");
        }
    }
}