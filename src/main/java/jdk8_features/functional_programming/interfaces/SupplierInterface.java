package jdk8_features.functional_programming.interfaces;

import java.util.function.Supplier;

/**
 * Supplier is a functional interface, it has only one abstract method get(), it returns an implementation
 */
public class SupplierInterface {

    public static void main(String[] args) {
        // get
        System.out.println(stringSupplier(() -> "Hello World"));
        System.out.println(intSupplier(() -> 100));
    }

    /**
     * 利用Supplier接口的get()方法把具体实现留给调用者
     */
    private static String stringSupplier(Supplier<String> supplier) {
        return supplier.get();
    }

    /**
     * 利用Supplier接口的get()方法把具体实现留给调用者
     */
    private static Integer intSupplier(Supplier<Integer> supplier) {
        return supplier.get();
    }
}
