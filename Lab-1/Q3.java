public class Q3 {
    public static void main(String[] args) 
    {
        System.out.println("Enter length of rectangle");
        System.out.println("Enter width of rectangle:");

        Double length = Double.parseDouble(args[0]);
        Double width = Double.parseDouble(args[1]);

        Double area = length * width;
        Double perimeter = 2 * (length + width);

        System.out.println("Area:" + area);
        System.out.println("Perimetet:" + perimeter);

    }   
}