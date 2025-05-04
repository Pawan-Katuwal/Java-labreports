// Box.java
class Box {
    private double width, height, depth;

    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public double volume() {
        return width * height * depth;
    }

    public double surfaceArea() {
        return 2 * (width * height + height * depth + depth * width);
    }
}

// MainBox.java
public class MainBox3{
    public static void main(String[] args) {
        Box box1 = new Box(2.5, 3.0, 4.0);
        Box box2 = new Box(1.5, 2.0, 3.5);

        System.out.println("Box 1 Volume: " + box1.volume());
        System.out.println("Box 1 Surface Area: " + box1.surfaceArea());

        System.out.println("Box 2 Volume: " + box2.volume());
        System.out.println("Box 2 Surface Area: " + box2.surfaceArea());
    }
}