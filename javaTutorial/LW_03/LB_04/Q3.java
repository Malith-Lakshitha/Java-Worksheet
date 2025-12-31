package LB_04;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program displays the word for a power of 10.");
        System.out.print("Enter a power of 10 (e.g., 6, 9, 12, ...): ");
        int power = sc.nextInt();

        System.out.print("Power of 10: " + power + " -> ");

        switch (power) {
            case 6:
                System.out.println("Million");
                break;
            case 9:
                System.out.println("Billion");
                break;
            case 12:
                System.out.println("Trillion");
                break;
            case 15:
                System.out.println("Quadrillion");
                break;
            case 18:
                System.out.println("Quintillion");
                break;
            case 21:
                System.out.println("Sextillion");
                break;
            case 30:
                System.out.println("Nonillion");
                break;
            case 100:
                System.out.println("Googol");
                break;
            default:
                System.out.println("No corresponding word for this power of 10");
        }
    }
}
