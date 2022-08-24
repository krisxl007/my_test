package java_foundation.generic_type.generic_type_class;

public class Main {
    
    public static void main(String[] args) {
        GenericClass<String> stringImpl = new GenericClass<>();
        GenericClass<Integer> integerImpl = new GenericClass<>();
        
        stringImpl.print("Hello world!");
        integerImpl.print(12345);
    }
}
