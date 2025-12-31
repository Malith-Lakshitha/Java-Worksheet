import java.util.Scanner;

public class Q1 {
    private double celsius;

    public Q1() {
        this.celsius = 0.0;
    }

    public Q1(double celsius) {
        this.celsius = celsius;
    }

    public double toCelsius() {
        return celsius;
    }

    public double toFahrenheit() {
        return celsius * 9 / 5 + 32;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsiusInput = sc.nextDouble();

        Q1 temp = new Q1(celsiusInput);

        System.out.println("Temperature in Fahrenheit: " + temp.toFahrenheit());

        sc.close();
    }
}
