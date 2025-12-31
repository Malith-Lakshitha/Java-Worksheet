package LB_04;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter the word to be replaced: ");
        String oldWord = sc.nextLine();

        System.out.print("Enter the replacement word: ");
        String newWord = sc.nextLine();

        String updatedSentence = sentence.replaceAll("\\b" + oldWord + "\\b", newWord);

        System.out.println("Updated sentence: " + updatedSentence);
    }
}
