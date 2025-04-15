package Basic;

public class DataTypes {
    public static void main(String[] args) {
        //1. Integer types
        byte a = 100;             // 1 byte
        short b = 10000;          // 2 bytes
        int c = 100000;           // 4 bytes (default)
        long d = 10000000000L;    // 8 bytes (note the 'L')

        //2. Floating-point types
        float e = 5.75f;          // 4 bytes (note the 'f')
        double f = 19.99;         // 8 bytes (default for decimals)

        //3. Character type
        char g = 'A';             // 2 bytes (Unicode)

        //4. Boolean type
        boolean isJavaFun = true; // 1 bit (true/false)

        //5. String (Non-primitive data type)
        String name = "Java Programmer";

        //Print all values
        System.out.println("Byte value: " + a);
        System.out.println("Short value: " + b);
        System.out.println("Int value: " + c);
        System.out.println("Long value: " + d);
        System.out.println("Float value: " + e);
        System.out.println("Double value: " + f);
        System.out.println("Char value: " + g);
        System.out.println("Boolean value: " + isJavaFun);
        System.out.println("String value: " + name);
    }
}
