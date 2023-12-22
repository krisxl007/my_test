package jdk8_features.functional_programming.interfaces;

import java.util.function.Consumer;

/**
 * Different from Function, Consumer returns nothing while Function returns something
 */
public class ConsumerInterface {

    public static void main(String[] args) {
        // accept
        acceptMethod(10, t -> System.out.println(t));
        acceptMethod("Hello", t -> System.out.println(t));

        // andThen
        andThenMethod(10, t -> System.out.println(t), t -> System.out.println(t + t));
    }

    /**
     * accept() is the abstract method of Consumer, it consumes the input lambda and return nothing
     */
    private static void acceptMethod(Object input, Consumer<Object> consumer) {
        consumer.accept(input);
    }

    /**
     * andThen() is a default method of Consumer, it runs the consumer first, then use the same input to run afterConsumer
     */
    private static void andThenMethod(Integer input, Consumer<Integer> consumer, Consumer<Integer> afterConsumer) {
        consumer.andThen(afterConsumer).accept(input);
    }
}
