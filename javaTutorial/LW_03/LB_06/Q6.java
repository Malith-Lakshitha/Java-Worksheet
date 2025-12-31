package LB_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Q6 {

    static class Pet {
        private String name;
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getType() { return "Pet"; }
    }

    static class Dog extends Pet {
        private double weight;
        public double getWeight() { return weight; }
        public void setWeight(double weight) { this.weight = weight; }
        @Override
        public String getType() { return "Dog"; }
    }

    static class Cat extends Pet {
        private String coatColor;
        public String getCoatColor() { return coatColor; }
        public void setCoatColor(String coatColor) { this.coatColor = coatColor; }
        @Override
        public String getType() { return "Cat"; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();
        ArrayList<Cat> cats = new ArrayList<>();

        while (true) {
            System.out.print("Enter pet name (or STOP to finish initial input): ");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("STOP")) break;

            System.out.print("Enter pet type ('c' for cat, 'd' for dog): ");
            char type = sc.nextLine().toLowerCase().charAt(0);

            if (type == 'c') {
                Cat cat = new Cat();
                cat.setName(name);
                System.out.print("Enter coat color: ");
                cat.setCoatColor(sc.nextLine());
                pets.add(cat);
                cats.add(cat);
            } else if (type == 'd') {
                Dog dog = new Dog();
                dog.setName(name);
                dog.setWeight(sc.nextDouble());
                sc.nextLine();
                pets.add(dog);
                dogs.add(dog);
            }
        }

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Remove Cat");
            System.out.println("4. Remove Dog");
            System.out.println("0. Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    Cat cat = new Cat();
                    System.out.print("Enter cat name: ");
                    cat.setName(sc.nextLine());
                    System.out.print("Enter coat color: ");
                    cat.setCoatColor(sc.nextLine());
                    pets.add(cat);
                    cats.add(cat);
                }
                case 2 -> {
                    Dog dog = new Dog();
                    System.out.print("Enter dog name: ");
                    dog.setName(sc.nextLine());
                    System.out.print("Enter weight: ");
                    dog.setWeight(sc.nextDouble());
                    sc.nextLine();
                    pets.add(dog);
                    dogs.add(dog);
                }
                case 3 -> {
                    System.out.print("Enter cat name to remove: ");
                    String catName = sc.nextLine();
                    Cat toRemove = null;
                    for (Cat cat : cats) {
                        if (cat.getName().equalsIgnoreCase(catName)) {
                            toRemove = cat;
                            break;
                        }
                    }
                    if (toRemove != null) {
                        cats.remove(toRemove);
                        pets.remove(toRemove);
                    }
                }
                case 4 -> {
                    System.out.print("Enter dog name to remove: ");
                    String dogName = sc.nextLine();
                    Dog toRemove = null;
                    for (Dog dog : dogs) {
                        if (dog.getName().equalsIgnoreCase(dogName)) {
                            toRemove = dog;
                            break;
                        }
                    }
                    if (toRemove != null) {
                        dogs.remove(toRemove);
                        pets.remove(toRemove);
                    }
                }
            }
        } while (choice != 0);

        System.out.println("\nCats:");
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " - Coat Color: " + cat.getCoatColor());
        }

        System.out.println("\nDogs:");
        for (Dog dog : dogs) {
            System.out.println(dog.getName() + " - Weight: " + dog.getWeight());
        }
    }
}
