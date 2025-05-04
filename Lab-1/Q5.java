public class Q5 {
    public static void main(String[] args) {
        Double P =Double.parseDouble(args[0]);
        Double T =Double.parseDouble(args[1]);
        Double R =Double.parseDouble(args[2]);
        Double SI = P * T * R /100;
        System.out.println("Simple Interest =" +SI);
    }
    
}