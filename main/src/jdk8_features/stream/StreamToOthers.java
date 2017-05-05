package jdk8_features.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 流转换为其它数据结构:
 */
public class StreamToOthers {
    public static void main(String[] args) {

        // 1. stream to array
        Stream<String> stream1 = Stream.of("a", "b", "c");
        String[] strArray1 = stream1.toArray(String[]::new);

        // 2. stream to list
        Stream<String> stream2_1 = Stream.of("a", "b", "c");
        Stream<String> stream2_2 = Stream.of("a", "b", "c");
        List<String> list1 = stream2_1.collect(Collectors.toList());
        List<String> list2 = stream2_2.collect(Collectors.toCollection(ArrayList::new));

        // 3. stream to set
        Stream<String> stream3 = Stream.of("a", "b", "c");
        Set set1 = stream3.collect(Collectors.toSet());

        // 4. stream to stack
        Stream<String> stream4 = Stream.of("a", "b", "c");
        Stack stack1 = stream4.collect(Collectors.toCollection(Stack::new));

        // 5. stream to map
        Stream<String> stream5 = Stream.of("a", "b", "c");
        Map<Integer, String> map = stream5.collect(Collectors.toMap((e) -> ID++, (e) -> e));
        System.out.println(map);

        // 6. stream to string
        Stream<String> stream6 = Stream.of("a", "b", "c");
        String str = stream6.collect(Collectors.joining()).toString();
    }

    private static Integer ID = 0;
}
