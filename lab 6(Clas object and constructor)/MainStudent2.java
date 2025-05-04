// Student.java
class Student {
    private String name;
    private String address;
    private int roll;

    public Student(String n, String a, int r) {
        name = n;
        address = a;
        roll = r;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Roll No: " + roll);
    }
}

// MainStudent.java
public class MainStudent2{
    public static void main(String[] args) {
        Student s1 = new Student("Pawan", "Kathmandu", 35);
        s1.display();
    }
}