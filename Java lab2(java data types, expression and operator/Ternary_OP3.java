import java.util.Scanner;
public class Ternary_OP3{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter three values:");

int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();

int large = (a<b)?(b<c?c:b):(a<c?c:a);
int small = (a>b)?(b>c?c:b):(a>c?c:a);

System.out.println("Largest ="+large);
System.out.println("smallest ="+small);
}
}