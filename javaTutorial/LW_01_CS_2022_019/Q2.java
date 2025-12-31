import java.util.Scanner;

public class Q2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name:");
        String fName = sc.nextLine();

        System.out.print("Enter your middle name:");
        String mName = sc.nextLine();

        System.out.print("Enter your last name:");
        String lName = sc.nextLine();

        char mInitial =Character.toUpperCase( mName.charAt(0));
        char lInitial =Character.toUpperCase(lName.charAt(0));
        char fIntial = Character.toUpperCase(fName.charAt(0));

        System.out.println(lInitial + lName.substring(1) +","+
                fIntial+fName.substring(1) + " " +  mInitial );

    }
}
