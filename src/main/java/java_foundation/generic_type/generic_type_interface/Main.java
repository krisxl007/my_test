package main.java.java_foundation.generic_type.generic_type_interface;

public class Main {
    
    public static void main(String[] args) {
        MyStringImplementation stringImplementation = new MyStringImplementation();
        MyIntegerImplementation myIntegerImplementation = new MyIntegerImplementation();
        
        stringImplementation.print("Hello");
        myIntegerImplementation.print(12345);
    }
}
