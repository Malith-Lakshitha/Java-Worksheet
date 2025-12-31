package LB_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {

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
            if (name.equalsIgnoreCase("STOP")) break;

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


        ArrayList<Dog> dogs = new ArrayList<>();
        for (Pet pet : pets) {
            if (pet instanceof Dog) {
                dogs.add((Dog) pet);
            }
        }

        if (dogs.isEmpty()) {
            System.out.println("\nNo dogs in the list.");
        } else {
            double sum = 0;
            double min = dogs.get(0).getWeight();
            double max = dogs.get(0).getWeight();

            for (Dog dog : dogs) {
                double w = dog.getWeight();
                sum += w;
                if (w < min) min = w;
                if (w > max) max = w;
            }

            double avg = sum / dogs.size();

            System.out.println("\nDog Weight Statistics:");
            System.out.println("Average weight: " + String.format("%.2f", avg));
            System.out.println("Minimum weight: " + String.format("%.2f", min));
            System.out.println("Maximum weight: " + String.format("%.2f", max));
        }
    }
}
