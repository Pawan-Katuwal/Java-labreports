abstract class Animal{
    abstract void makeSound(); // Abstract method (must be implemented by subclass)

    void sleep() { // Concrete method
        System.out.println("Animal sleeps");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Abstract6 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.makeSound();
        a.sleep();
    }
}