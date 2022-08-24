package java_foundation.generic_type.generic_type_method;

public class Main {
    
    /**
     * here need to have '<T>' to specify this is a generic type method
     */
    public static <T> void print(T value) {
        System.out.println("Type: " + value.getClass() + ". Value: " + value);
    }
    
    public static void main(String[] args) {
        print("Hello world!");
        print(12345);
    }
}
