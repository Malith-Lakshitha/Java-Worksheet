package LB_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {

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
        @Override
        public String getType() {
            return "Dog";
        }
    }

    static class Cat extends Pet {
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
                pets.add(cat);
            } else if (type == 'd') {
                Dog dog = new Dog();
                dog.setName(name);
                pets.add(dog);
            } else {
                System.out.println("Invalid type. Skipping this pet.");
            }
        }

        System.out.println("\nList of pets:");

        System.out.println("\nCats:");
        for (Pet pet : pets) {
            if (pet instanceof Cat) {
                System.out.println(pet.getName());
            }
        }

        System.out.println("\nDogs:");
        for (Pet pet : pets) {
            if (pet instanceof Dog) {
                System.out.println(pet.getName());
            }
        }
    }
}
