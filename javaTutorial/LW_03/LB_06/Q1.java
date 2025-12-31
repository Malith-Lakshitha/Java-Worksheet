package LB_06;

public class Q1 {

    static class Pet {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String petName) {
            name = petName;
        }

        public String speak() {
            return "I'm your cuddly little pet.";
        }
    }

    static class Dog extends Pet {
        @Override
        public String speak() {
            return "Woof!";
        }
    }

    static class Cat extends Pet {
        @Override
        public String speak() {
            return "Meow!";
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Buddy");
        Cat cat = new Cat();
        cat.setName("Whiskers");

        System.out.println(dog.getName() + " says: " + dog.speak());
        System.out.println(cat.getName() + " says: " + cat.speak());
    }
}
