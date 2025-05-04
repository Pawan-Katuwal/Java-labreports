import java.util.Scanner;

public class Els_iff3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        
        int secondLargest;
        
        if ((num1 > num2 && num1 < num3) || (num1 > num3 && num1 < num2)) {
            secondLargest = num1;
        } else if ((num2 > num1 && num2 < num3) || (num2 > num3 && num2 < num1)) {
            secondLargest = num2;
        } else {
            secondLargest = num3;
        }
        
        System.out.println("The second largest number is: " + secondLargest);
        
        sc.close();
    }
}
