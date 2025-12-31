import java.util.Scanner;
import java.util.StringTokenizer;

public class Q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();


        StringTokenizer st = new StringTokenizer(sentence, " ,.!?;:'\"");

        String cleanSentence = "";

        while (st.hasMoreTokens()) {
            cleanSentence += st.nextToken().toLowerCase();
        }


        boolean isPalindrome = true;
        int start = 0;
        int end = cleanSentence.length() - 1;

        while (start < end) {
            if (cleanSentence.charAt(start) != cleanSentence.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("The sentence is a palindrome.");
        } else {
            System.out.println("The sentence is NOT a palindrome.");
        }

        sc.close();
    }
}
