package java_foundation.generic_type.generic_type_interface;

public class MyIntegerImplementation implements GenericInterface<Integer> {
    
    @Override
    public void print(Integer value) {
        System.out.println("Value: " + value);
    }
}
