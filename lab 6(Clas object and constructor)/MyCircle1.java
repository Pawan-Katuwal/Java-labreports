// Circle.java
class Circle {
    private float radius;

    public Circle(float r) {
        radius = r;
    }

    public float findArea() {
        return (float)(Math.PI * radius * radius);
    }

    public float findCircumference() {
        return (float)(2 * Math.PI * radius);
    }
}

// MyCircle.java
public class MyCircle1{
    public static void main(String[] args) {
        Circle c1 = new Circle(5.5f);
        System.out.println("Area: " + c1.findArea());
        System.out.println("Circumference: " + c1.findCircumference());
    }
}