package java_foundation.generic_type.generic_type_class;

public class GenericClass<T> {
    
    void print(T value) {
        System.out.println("Type: " + value.getClass() + ". Value: " + value);
    }
}
