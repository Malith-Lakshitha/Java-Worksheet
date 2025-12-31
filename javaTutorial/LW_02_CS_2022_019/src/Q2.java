import java.util.Scanner;

class Q2 {


    public static int countDigits(long num) {
        int count = 0;

        if (num == 0) {
            return 1;
        }

        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer (negative to stop): ");
            long number = sc.nextLong();

            if (number < 0) {
                System.out.println("Program terminated.");
                break;
            }

            int digits = countDigits(number);
            System.out.println("Number of digits: " + digits);
        }

        sc.close();
    }
}
