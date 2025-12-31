import java.util.Scanner;

public class Q1 {

    public static char middleCharacter(String word){
        int lenght = word.length();
        int middleIndex = lenght/2;
        return word.charAt(middleIndex);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter odd-lenght word:");
        String input = sc.nextLine();

        if (input.length()%2==1){
            char middle = middleCharacter(input);
            System.out.println("Middle character : " + middle);
        }
        else {
            System.out.println("Please enter odd-lenght word.");
        }
    }
}
