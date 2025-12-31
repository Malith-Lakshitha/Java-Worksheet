package LB_04;

import java.util.Scanner;
import java.util.Random;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int guess = 0;

        System.out.println("Guess the number between 1 and 100.");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess < numberToGuess) {
                System.out.println("Higher!");
            } else if (guess > numberToGuess) {
                System.out.println("Lower!");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + numberToGuess);
            }
        }
    }
}
