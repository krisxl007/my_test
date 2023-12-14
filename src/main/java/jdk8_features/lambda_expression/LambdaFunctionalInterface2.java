package jdk8_features.lambda_expression;

/**
 * only 1 abstract method is allowed in functional interface, class implementing this functional interface will override it. but default and static
 * methods are allowed
 */
@FunctionalInterface
public interface LambdaFunctionalInterface2 {
    // abstract method
    void print(String str);

    default void print2(String str) {
        System.out.println("print2");
    };

    default void print3(String str) {
        System.out.println("print3");
    };

    static void print4(String str) {
        System.out.println("print4");
    };

    static void print5(String str) {
        System.out.println("print5");
    };
}
