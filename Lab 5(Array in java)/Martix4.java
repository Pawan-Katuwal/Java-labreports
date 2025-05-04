import java.util.Scanner;

public class Martix4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] num1 = new int[3][3];
        int[][] num2 = new int[3][3];
        int[][] result = new int[3][3];

        System.out.println("Enter elements of first 3x3 matrix:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                num1[i][j] = sc.nextInt();

        System.out.println("Enter elements of second 3x3 matrix:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                num2[i][j] = sc.nextInt();

        // Multiplication logic
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    result[i][j] += num1[i][k] * num2[k][j];
                }
            }
        }

        System.out.println("Resultant matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}