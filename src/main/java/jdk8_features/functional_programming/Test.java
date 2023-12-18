package jdk8_features.functional_programming;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {

    public static void main(String[] args) {
        Function<Integer, Integer> function = (x) -> x + 1;
        System.out.println(function.apply(1));

        Consumer<Integer> consumer = (x) -> System.out.println(x + 1);
        consumer.accept(1);

        Predicate<Integer> predicate = (x) -> x > 1;
        System.out.println(predicate.test(2));

        Supplier<Integer> supplier = () -> 1;
        System.out.println(supplier.get());
    }
}
