import java.util.Scanner;

public class NS_ELS_ST4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get number from user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check divisibility by 3
        if (num % 3 == 0) {
            if (num % 2 == 0) {
                System.out.println("The number is even and divisible by 3.");
            } else {
                System.out.println("The number is odd and divisible by 3.");
            }
        } else {
            System.out.println("The number is not divisible by 3.");
        }
        
        scanner.close();
    }
}
