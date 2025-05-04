public class Q2
{
    public static void main(String[] args) 
    {
      int n1= Integer.parseInt(args[0]);
      int n2= Integer.parseInt(args[1]);
      int sum= n1 + n2;
      int diff= n1 - n2;
      int mult= n1 * n2;
      int div= n1 / n2;
      System.out.println("Sum is" + sum);
      System.out.println("Difference is" + diff);
      System.out.println("Multiplication is" + mult);
      System.out.println("Division is" + div);
    }
}
