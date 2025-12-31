package LB_04;

import java.util.Scanner;

public class Q7 {

    public static int countDigits(int num) {
        num = Math.abs(num);
        if (num == 0) return 1;
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        while (true) {
            System.out.print("Enter an integer (negative to quit): ");
            input = sc.nextInt();

            if (input < 0) {
                System.out.println("Program terminated.");
                break;
            }

            int digits = countDigits(input);
            System.out.println("The number " + input + " has " + digits + " digit(s).");
        }
    }
}
