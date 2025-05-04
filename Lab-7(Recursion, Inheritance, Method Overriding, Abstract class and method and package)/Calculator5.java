interface Add {
    default int add(int a, int b) {
        return a + b;
    }
}

interface Subtract {
    default int subtract(int a, int b) {
        return a - b;
    }
}

interface Multiply {
    default int multiply(int a, int b) {
        return a * b;
    }
}

interface Divide {
    default double divide(int a, int b) {
        return (double) a / b;
    }
}

class Calculator implements Add, Subtract, Multiply, Divide {
}

public class Calculator5 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Add: " + c.add(10, 5));
        System.out.println("Subtract: " + c.subtract(10, 5));
        System.out.println("Multiply: " + c.multiply(10, 5));
        System.out.println("Divide: " + c.divide(10, 5));
    }
}