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

    static void reversal(int number) {

        int num[] = {number/1000, (number%1000)/100, (number%100)/10, number%10};

        int lengthAndIndex = 0;
        for(int i = 0; i < num.length; i++) {
            if(num[i] % 2 == 0) {
                lengthAndIndex++;
            }
        }
        int pos[] = new int[lengthAndIndex];

        lengthAndIndex = 0;
        for(int i = 0; i < num.length; i++) {
            if(num[i] % 2 == 0) {
                pos[lengthAndIndex] = i;
                lengthAndIndex++;
            }
        }

        for(int i = 0; i < pos.length; i++) {
            System.out.print(pos[i] + " ");
        }

        String reverse = "";
        boolean ifEven = false;
        for(int i = num.length - 1; i >= 0 ; i--) {
            for(int j = 0; j < pos.length; j++) {
                if(i == pos[j]) {
                    ifEven = true;
                    reverse += num[j];
                }
            }
            if(ifEven == false) {
                reverse += num[i];
            }
        }

        for(int i = reverse.length() - 1; i >= 0; i--) {
            System.out.print(reverse.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = inputs.nextInt();

        reversal(number);
        inputs.close();
    }
}