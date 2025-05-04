class Animal {
    void sound() {
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class SingleLevel {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();
    }
}