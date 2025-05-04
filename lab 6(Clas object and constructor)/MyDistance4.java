// Distance.java
class Distance {
    private int feet;
    private int inches;

    public Distance(int f, int i) {
        feet = f;
        inches = i;
        normalize();
    }

    private void normalize() {
        feet += inches / 12;
        inches %= 12;
    }

    public Distance addDistance(Distance d) {
        return new Distance(this.feet + d.feet, this.inches + d.inches);
    }

    public void displayDistance() {
        System.out.println(feet + " feet " + inches + " inches");
    }
}

// MyDistance.java
public class MyDistance4{
    public static void main(String[] args) {
        Distance d1 = new Distance(5, 8);
        Distance d2 = new Distance(3, 10);
        Distance d3 = d1.addDistance(d2);

        System.out.print("Distance 1: ");
        d1.displayDistance();

        System.out.print("Distance 2: ");
        d2.displayDistance();

        System.out.print("Sum: ");
        d3.displayDistance();
    }
}