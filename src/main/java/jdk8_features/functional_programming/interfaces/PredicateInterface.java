package jdk8_features.functional_programming.interfaces;

import java.util.function.Predicate;

public class PredicateInterface {

    public static void main(String[] args) {
        // test
        Predicate<Integer> largerThan1 = x -> x > 1;
        System.out.println(testMethod(2, largerThan1));

        // negate
        System.out.println(negateMethod(2, largerThan1));

        // and
        Predicate<Integer> largerThan0 = x -> x > 0;
        Predicate<Integer> lessThan3 = x -> x < 3;
        System.out.println(andMethod(2, largerThan0, lessThan3));

        // or
        System.out.println(orMethod(5, largerThan0, lessThan3));

        // isEqual
        System.out.println(isEqualMethod(1, 1));

        // not
        System.out.println(notMethod(0, largerThan1));
    }

    /**
     * test() is the abstract method of Predicate, it returns a boolean value by given input
     */
    private static boolean testMethod(Integer intNumber, Predicate<Integer> predicate) {
        return predicate.test(intNumber);
    }

    /**
     * negate() is a default method of Predicate, it returns the opposite boolean value of test()
     */
    private static boolean negateMethod(Integer intNumber, Predicate<Integer> predicate) {
        return predicate.negate().test(intNumber);
    }

    /**
     * and() is a default method of Predicate, it combines two predicates with AND logic
     */
    private static boolean andMethod(Integer intNumber, Predicate<Integer> predicate1, Predicate<Integer> predicate2) {
        return predicate1.and(predicate2).test(intNumber);
    }

    /**
     * or() is a default method of Predicate, it combines two predicates with OR logic
     */
    private static boolean orMethod(Integer intNumber, Predicate<Integer> predicate1, Predicate<Integer> predicate2) {
        return predicate1.or(predicate2).test(intNumber);
    }

    /**
     * isEqual() is a static method of Predicate, it returns a predicate for checking if 2 objects are equal
     */
    private static boolean isEqualMethod(Integer number1, Integer number2) {
        return Predicate.isEqual(number1).test(number2);
    }

    /**
     * not() is a static method of Predicate, it returns a predicate for checking if the given predicate is not true
     */
    private static boolean notMethod(Integer intNumber, Predicate<Integer> predicate) {
        return Predicate.not(predicate).test(intNumber);
    }
}
