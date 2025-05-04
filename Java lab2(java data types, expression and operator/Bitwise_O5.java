import java.util.Scanner;

public class Bitwise_O5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for two integers
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        // Performing bitwise operations
        System.out.println("\nBitwise AND: " + (num1 & num2));
        System.out.println("Bitwise OR : " + (num1 | num2));
        System.out.println("Bitwise XOR : " + (num1 ^ num2));
        System.out.println("Bitwise NOT : " + (~num1));
        System.out.println("Left Shift : " + (num1 << 1));
        System.out.println("Right Shift : " + (num1 >> 1));

        sc.close();
    }
}