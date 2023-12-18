package jdk8_features.functional_programming.interfaces;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionInterface {

    public static void main(String[] args) {
        // apply
        System.out.println(applyMethod(10, t -> String.valueOf(t + t)));
        System.out.println(applyMethod(20, t -> String.valueOf(t * t)));

        // compose
        Function<Integer, Integer> beforeFunction = t -> t * t; // before function runs before compose function
        Function<Integer, String> composeFunction = t -> String.valueOf(t + t); // then using the return value above as the input of compose function
        System.out.println(composeMethod(10, composeFunction, beforeFunction));

        // andThen
        Function<Integer, Integer> functionToRunFirst = t -> t * t; // function that runs first
        Function<Integer, String> afterFunction = t -> String.valueOf(t + t); // then using the return value above as the input of after function
        System.out.println(andThenMethod(10, functionToRunFirst, afterFunction));

        // identify
        identifyMethod();
    }

    /**
     * apply() is the abstract method of Function, it receives the first type and returns the second type
     */
    private static String applyMethod(Integer intNumber, Function<Integer, String> function) {
        return function.apply(intNumber);
    }

    /**
     * compose() is a default method of Function, it runs the before function first, then use the return value of before function as the input of
     * compose function
     */
    private static String composeMethod(Integer intNumber, Function<Integer, String> function, Function<Integer, Integer> beforeFunction) {
        return function.compose(beforeFunction).apply(intNumber);
    }

    /**
     * andThen() is a default method of Function, it runs the function first, then use the return value of function as the input of after function
     */
    private static String andThenMethod(Integer intNumber, Function<Integer, Integer> function, Function<Integer, String> afterFunction) {
        return function.andThen(afterFunction).apply(intNumber);
    }

    /**
     * identify() is a static method of Function, it returns a lambda t -> t
     */
    private static void identifyMethod() {
        Stream<String> stream = Stream.of("Hello", "World");
        Stream<String> stream2 = Stream.of("Hello", "World");
        Map<String, Integer> map = stream.collect(Collectors.toMap(Function.identity(), String::length));
        Map<String, Integer> map2 = stream2.collect(Collectors.toMap(t -> t + t, String::length));
        System.out.println(map);
        System.out.println(map2);
    }
}
