import java.util.Scanner;

public class Q2 {
    private double celsius;

    public Q2() {
        this.celsius = 0.0;
    }

    public Q2(double celsius) {
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

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheitInput = sc.nextDouble();

        Q2 temp = new Q2();
        temp.setFahrenheit(fahrenheitInput);

        System.out.println("Temperature in Celsius: " + temp.toCelsius());

        sc.close();
    }
}
