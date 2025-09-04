package TrickyLogics_Java;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = inputs.nextInt();
        
        if(isPrime(num)) {
            System.out.println(num + " is a Prime number");
        }
        else {
            System.out.println(num + " is not a Prime number");
        }

        inputs.close();
    }

    public static boolean isPrime(int num) {
        if(num <= 1) {
            return false;
        }
        else if(num == 2) {
            return true;
        }
        else if(num % 2 == 0) {
            return false;
        }
        else {
            for(int i = 3; i * i <= num; i+=2) {
                if(num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
