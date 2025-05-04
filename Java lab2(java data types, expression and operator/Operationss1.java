import java.util.Scanner;

public class Operationss1{
public static void main (String[] args){

int a=9;
int b=13;
int c=3;

double x=a-b/3.0+c*2-1;
double y=a-(float)b/(3+c)*(2-1);
double z=a-((float)b/(3+c)*2)-1;

System.out.println("x="+x);
System.out.println("y="+y);
System.out.println("z="+z);
}
}