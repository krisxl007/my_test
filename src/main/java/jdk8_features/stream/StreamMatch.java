package jdk8_features.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Stream 有三个 match 方法，从语义上说：
 * allMatch：Stream 中全部元素符合传入的 predicate，返回 true
 * anyMatch：Stream 中只要有一个元素符合传入的 predicate，返回 true
 * noneMatch：Stream 中没有一个元素符合传入的 predicate，返回 true
 */
public class StreamMatch {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // allMatch
        boolean match1 = list.stream().allMatch(n -> n > 0);
        System.out.println("All larger than 0? : " + match1);

        // anyMatch
        boolean match2 = list.stream().anyMatch(n -> n > 5);
        System.out.println("Any larger than 5? : " + match2);

        // noneMatch
        boolean match3 = list.stream().noneMatch(n -> n == 3);
        System.out.println("None match of 3? : " + match3);
    }
}
