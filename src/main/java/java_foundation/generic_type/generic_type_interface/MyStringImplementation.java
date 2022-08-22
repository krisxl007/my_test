package java_foundation.generic_type.generic_type_interface;

public class MyStringImplementation implements GenericInterface<String> {
    
    @Override
    public void print(String value) {
        System.out.println("Value: " + value);
    }
}
