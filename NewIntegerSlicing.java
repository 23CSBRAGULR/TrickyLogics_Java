import java.util.Scanner;

public class NewIntegerSlicing {

    public static String digitNames[] = {
        "Ones", "Tens", "Hundreds", "Thousands", "Ten Thousads", "Lakhs", "Ten Lakhs", "Crores", "Ten Crores"
    };

    static int digitCount(int number) {
        int digitCount = 0;
        while(number != 0) {
            number /= 10;
            digitCount++;
        }
        return digitCount;
    }

    static int[] digitSlicing(int number, int digitCount, int divisor) {
        int digits[] = new int[digitCount];
        for(int i = 0; i < digitCount; i++) {
            digits[i] = (number%divisor)/(divisor/10);
            divisor /= 10;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int number = inputs.nextInt();
        
        int digitCount = digitCount(number);
        int divisor = (int)(Math.pow(10, digitCount));
        int digits[] = digitSlicing(number, digitCount, divisor);

        int digit = 0;
        for(int i = digits.length - 1; i >= 0; i--) {
            System.out.println(digits[digit] + " : " + digitNames[i]);
            digit++;
        }
        inputs.close();
    }
}