import java.util.Scanner;

public class DivisionWithoutOperators {

    static void division(int fn, int sn) {
        int divisor = sn;
        int quotient = 0;
        int remainder = 0;

        while(sn <= fn) {
            sn += divisor;
            quotient++;
        }

        sn -= divisor;
        remainder = fn - sn;

        System.out.println("Remainder = " + remainder);
        System.out.println("Quotient = " + quotient);
    }

    /*static void division(int dividend, int divisor) {
        int quotient = 0;
        int remainder = dividend;

        while (remainder >= divisor) {
            remainder -= divisor;
            quotient++;
        }

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }*/

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter the Dividend : ");
        int dd = inputs.nextInt();
        System.out.print("Enter the Divisor : ");
        int ds = inputs.nextInt();

        while((ds > dd || ds == 0) && dd != 0) {
            if(ds > dd) {
                System.out.print("Enter a Divisor that is smaller than the Dividend for correct results : ");
                ds = inputs.nextInt();
            }
            else {
                System.out.print("The Divisor cannot be Zero, Enter a Valid Number : ");
                ds = inputs.nextInt();
            }
        }
        division(dd, ds);
    }
}