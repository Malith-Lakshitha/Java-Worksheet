package LB_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {

    static class Pet {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String petName) {
            name = petName;
        }

        public String getType() {
            return "Pet";
        }
    }

    static class Dog extends Pet {
        private double weight;

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        @Override
        public String getType() {
            return "Dog";
        }
    }

    static class Cat extends Pet {
        private String coatColor;

        public String getCoatColor() {
            return coatColor;
        }

        public void setCoatColor(String coatColor) {
            this.coatColor = coatColor;
        }

        @Override
        public String getType() {
            return "Cat";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        while (true) {
            System.out.print("Enter pet name (or STOP to finish): ");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("STOP")) {
                break;
            }

            System.out.print("Enter pet type ('c' for cat, 'd' for dog): ");
            char type = sc.nextLine().toLowerCase().charAt(0);

            if (type == 'c') {
                Cat cat = new Cat();
                cat.setName(name);
                System.out.print("Enter coat color: ");
                String color = sc.nextLine();
                cat.setCoatColor(color);
                pets.add(cat);
            } else if (type == 'd') {
                Dog dog = new Dog();
                dog.setName(name);
                System.out.print("Enter weight: ");
                double weight = sc.nextDouble();
                sc.nextLine(); // consume newline
                dog.setWeight(weight);
                pets.add(dog);
            } else {
                System.out.println("Invalid type. Skipping this pet.");
            }
        }

        System.out.println("\nList of pets:");

        System.out.println("\nCats:");
        for (Pet pet : pets) {
            if (pet instanceof Cat) {
                Cat cat = (Cat) pet;
                System.out.println(cat.getName() + " - " + cat.getType() + " - Coat Color: " + cat.getCoatColor());
            }
        }

        System.out.println("\nDogs:");
        for (Pet pet : pets) {
            if (pet instanceof Dog) {
                Dog dog = (Dog) pet;
                System.out.println(dog.getName() + " - " + dog.getType() + " - Weight: " + dog.getWeight());
            }
        }
    }
}
