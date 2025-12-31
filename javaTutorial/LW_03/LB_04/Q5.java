package LB_04;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        String[] entrees = {"Tofu Burger", "Cajun Chicken", "Buffalo Wings", "Rainbow Fillet"};
        double[] entreePrices = {3.49, 4.59, 3.99, 2.99};

        String[] sides = {"Rice Cracker", "No-Salt Fries", "Zucchini", "Brown Rice"};
        double[] sidePrices = {0.79, 0.69, 1.09, 0.59};

        String[] drinks = {"Cafe Mocha", "Cafe Latte", "Espresso", "Oolong Tea"};
        double[] drinkPrices = {1.99, 1.90, 2.49, 0.99};

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to MyJava Lo-Fat Burgers!");
        System.out.println("Please choose your items from the menu.\n");

        System.out.println("Entree Menu:");
        for (int i = 0; i < entrees.length; i++) {
            System.out.printf("%d. %s - $%.2f\n", i+1, entrees[i], entreePrices[i]);
        }
        System.out.print("Select an entree (1-4): ");
        int entreeChoice = sc.nextInt() - 1;

        System.out.println("\nSide Dish Menu:");
        for (int i = 0; i < sides.length; i++) {
            System.out.printf("%d. %s - $%.2f\n", i+1, sides[i], sidePrices[i]);
        }
        System.out.print("Select a side dish (1-4): ");
        int sideChoice = sc.nextInt() - 1;

        System.out.println("\nDrink Menu:");
        for (int i = 0; i < drinks.length; i++) {
            System.out.printf("%d. %s - $%.2f\n", i+1, drinks[i], drinkPrices[i]);
        }
        System.out.print("Select a drink (1-4): ");
        int drinkChoice = sc.nextInt() - 1;

        double total = entreePrices[entreeChoice] + sidePrices[sideChoice] + drinkPrices[drinkChoice];

        System.out.println("\nYour Order Summary:");
        System.out.println("Entree: " + entrees[entreeChoice] + " - $" + String.format("%.2f", entreePrices[entreeChoice]));
        System.out.println("Side Dish: " + sides[sideChoice] + " - $" + String.format("%.2f", sidePrices[sideChoice]));
        System.out.println("Drink: " + drinks[drinkChoice] + " - $" + String.format("%.2f", drinkPrices[drinkChoice]));
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Thank you for your order!");
    }
}
