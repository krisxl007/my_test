package jdk8_features.stream;

import java.util.stream.Stream;

/**
 * filter 对原始 Stream 进行某项测试，通过测试的元素被留下来生成一个新 Stream
 */
public class StreamFilter {

    public static void main(String[] args) {

        // filter even number
        Integer[] sixNums = { 1, 2, 3, 4, 5, 6 };
        Integer[] evens =
                Stream.of(sixNums).filter(n -> n % 2 == 0).toArray(Integer[]::new);
        Stream.of(evens).forEach(System.out::println);

        // filter numbers larger than 3
        Integer[] largerThan3 =
                Stream.of(sixNums).filter(n -> n > 3).toArray(Integer[]::new);
        Stream.of(largerThan3).forEach(System.out::println);
    }
}
