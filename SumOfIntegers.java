import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int number = inputs.nextInt();

        int sum = 0;
        while(number != 0) {
            sum += (number%10);
            number /= 10;
        }

        System.out.println("Sum of the Given Number : " + sum);
        inputs.close();
    }
}