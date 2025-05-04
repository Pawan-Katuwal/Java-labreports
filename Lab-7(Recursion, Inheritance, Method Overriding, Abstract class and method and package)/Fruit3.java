// Base class Fruit
class Fruit {
    String name;
    String taste;
    int size;

    void eat() {
        System.out.println("Fruit name: " + name + ", Taste: " + taste);
    }
}

// Derived class Apple
class Apple extends Fruit {
    Apple() {
        name = "Apple";
        taste = "Sweet";
        size = 5;
    }

    @Override
    void eat() {
        System.out.println("This is an " + name + ", it tastes " + taste + " and size is " + size);
    }
}

// Derived class Orange
class Orange extends Fruit {
    Orange() {
        name = "Orange";
        taste = "Sour";
        size = 4;
    }

    @Override
    void eat() {
        System.out.println("This is an " + name + ", it tastes " + taste + " and size is " + size);
    }
}

// Demo class to test the functionality
public class Fruit3 {
    public static void main(String[] args) {
        Fruit f1 = new Apple();
        Fruit f2 = new Orange();

        f1.eat();  // Calls Apple’s eat()
        f2.eat();  // Calls Orange’s eat()
    }
}