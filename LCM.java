import java.util.Scanner;

public class LCM {

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

    int lcmClaculation(int number1, int number2, int gcd) {
        int lcm = (number1*number2) / gcd;
        return lcm;
    }

    public static void main(String[] args) {
        LCM ob = new LCM();
        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int firstNumber = inputs.nextInt();
        System.out.print("Enter the second number : ");
        int secondNumber = inputs.nextInt();

        int gcd = ob.gcdCalculation(firstNumber, secondNumber);
        int lcm = ob.lcmClaculation(firstNumber, secondNumber, gcd);

        System.out.println("The LCM of " + firstNumber + " and " + secondNumber + " is " + lcm);
    }
}