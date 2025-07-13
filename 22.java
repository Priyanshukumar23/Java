public class Main {
    public static void main(String[] args) {
        // 1. Declare and initialize each primitive type
        int myInt = 42;
        float myFloat = 3.14f;
        double myDouble = 99.99;
        char myChar = 'A';
        boolean myBoolean = true;

        // 2. Print all primitive values
        System.out.println("Integer value: " + myInt);
        System.out.println("Float value: " + myFloat);
        System.out.println("Double value: " + myDouble);
        System.out.println("Character value: " + myChar);
        System.out.println("Boolean value: " + myBoolean);

        // 3. Convert float to int
        int convertedInt = (int) myFloat;
        System.out.println("\nAfter converting float to int:");
        System.out.println("Original float: " + myFloat);
        System.out.println("Converted int: " + convertedInt);

        // 4. Convert int to double
        double convertedDouble = myInt;
        System.out.println("\nAfter converting int to double:");
        System.out.println("Original int: " + myInt);
        System.out.println("Converted double: " + convertedDouble);
    }
}
