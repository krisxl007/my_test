package jdk8_features.stream;

import java.util.Arrays;
import java.util.List;

/**
 * limit 返回 Stream 的前面 n 个元素；skip 则是扔掉前 n 个元素
 */
public class StreamLimitSkip {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("AA", "BB", "CC", "DD", "EE");
        list.stream().limit(3).forEach(n -> System.out.println("limit first 3 elements: " + n));
        list.stream().skip(3).forEach(n -> System.out.println("skip first 3 elements: " + n));
    }
}
