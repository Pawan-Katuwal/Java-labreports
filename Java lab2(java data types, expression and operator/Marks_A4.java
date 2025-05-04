import java.util.Scanner;

public class Marks_A4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for all 5 subjects in one line
        System.out.print("Enter marks for 5 subjects: ");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();

        // Calculating total and average
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        double average = total / 5.0;

        // Displaying the result
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + average);

        sc.close();
    }
}