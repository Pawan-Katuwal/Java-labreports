import java.util.Scanner;

public class Armstrong_or_not3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num, sum = 0, digits = 0;

        // Count digits
        int temp = num;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        // Calculate Armstrong sum
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        System.out.println(num + (sum == original ? " is an Armstrong number." : " is not an Armstrong number."));
        sc.close();
    }
}