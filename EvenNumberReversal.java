import java.util.Scanner;

public class EvenNumberReversal {

    static int digitCount(int number) {
        int digitCount = 0;
        while(number != 0) {
            number /= 10;
            digitCount++;
        }
        return digitCount;
    }

    static int[] digitSlicing(int number) {
        int digitCount = digitCount(number);
        int digits[] = new int[digitCount];
        
        int divisor = 1;
        for(int i = 1; i <= digitCount; i++) {
            divisor *= 10;
        }

        for(int i = 0; i < digitCount; i++) {
            digits[i] = (number%divisor)/(divisor/10);
            divisor /= 10;
        }

        return digits;
    }

    static void reversal(int number) {

        int num[] = digitSlicing(number);
        int evens = 0;
        for(int i = 0; i < num.length; i++) {
            if(num[i] % 2 == 0) {
                evens++;
            }
        }
        int pos[] = new int[evens];

        evens = 0;
        for(int i = 0; i < num.length; i++) {
            if(num[i] % 2 == 0) {
                pos[evens] = i;
                evens++;
            }
        }

        System.out.print("After Reversal : ");
        evens = pos.length - 1;
        int index = 0;
        
        for(int i = 0; i < num.length ; i++) {
            if(i == pos[index]) {
                System.out.print(num[pos[evens]]);
                evens--;
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

        System.out.print("\nEnter the number : ");
        int number = inputs.nextInt();

        while(number < 0) {
            System.out.print("Enter a Valid Number : ");
            number = inputs.nextInt();
        }

        System.out.println("\nOriginal Number : " + number);
        reversal(number);
        inputs.close();
    }
}