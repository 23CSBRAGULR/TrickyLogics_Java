import java.util.Scanner;

public class EvenNumberReversal {

    static void reversal(int number) {

        int num[] = {number/1000, (number%1000)/100, (number%100)/10, number%10};

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

        System.out.print("\nAfter Reversal : ");
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

        System.out.print("\nEnter the number(upto 9999) : ");
        int number = inputs.nextInt();

        while(number > 9999 || number < 0) {
            System.out.print("\nEnter a Valid Number : ");
            number = inputs.nextInt();
        }

        reversal(number);
        inputs.close();
    }
}