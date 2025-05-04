public class Wrappe4{
    public static void main(String[] args) {

        int primitiveInt = 25;
        Integer wrapperInt = primitiveInt;
        System.out.println("Autoboxing: int to Integer");
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapped Integer object: " + wrapperInt);

        
        Double wrapperDouble = 45.67;
        double primitiveDouble = wrapperDouble;
        System.out.println("\nUnboxing: Double to double");
        System.out.println("Wrapper Double object: " + wrapperDouble);
        System.out.println("Primitive double: " + primitiveDouble);
    }
}