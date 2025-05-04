class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Triangle extends Shape {
    void area() {
        int base = 10, height = 5;
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

class Rectangle extends Shape {
    void area() {
        int length = 10, breadth = 5;
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Shape4 {
    public static void main(String[] args) {
        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        s1.area();
        s2.area();
    }
}