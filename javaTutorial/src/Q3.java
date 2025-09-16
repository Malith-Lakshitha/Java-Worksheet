import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter lenght in CM:");
        double cm = sc.nextDouble();

        double inches = cm/2.54;
        int feet = (int)(inches/12);
        inches = inches - (feet*12);

        System.out.println(String.format("%.2f cm= %d feet  %.2f inches",cm,feet,inches));
    }
}
