public class Q4 {
    public static void main(String[] args) {
        Double celcius = Double.parseDouble(args[0]);
        Double fahrenheit = ((celcius * 9)/5)+32;
        System.out.println(celcius+"Celcius converted to fahrenheit" + fahrenheit);
    }
    
}
