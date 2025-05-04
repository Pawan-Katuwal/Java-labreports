import java.util.Scanner;
public class Swapp2{
public static void main(String[] args){

Scanner sc =new Scanner(System.in);
System.out.println("Enter Two Values:");

int num1 = sc.nextInt();
int num2 = sc.nextInt();

System.out.println("Using a third variables:");
System.out.println("Before Swap: num1 = "+num1 + "num2 =" + num2);
int num3 = num1;
num1=num2;
num2=num3;

System.out.println("After swap: num1 = " + num1 + "num2 = "+num2);
}
}