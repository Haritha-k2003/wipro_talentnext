import java.util.Scanner;

// Base class
class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Derived class
class Bird extends Animal {
    @Override
    public void eat() {
        System.out.println("Bird is pecking food");
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping in its nest");
    }

    public void fly() {
        System.out.println("Bird is flying in the sky");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int choice = scanner.nextInt();

        if (choice == 1) {
            Animal animal = new Animal();
            animal.eat();
            animal.sleep();
        } else if (choice == 2) {
            Bird bird = new Bird();
            bird.eat();
            bird.sleep();
            bird.fly();
        } else {
            System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
