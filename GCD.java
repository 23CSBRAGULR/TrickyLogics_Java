import java.util.Scanner;

public class GCD {

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
        int length = 0;
        for(int i = 1; i <= smallest; i++) {
            if(smallest%i == 0) {
                length++;
            }
        }
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
    }
}