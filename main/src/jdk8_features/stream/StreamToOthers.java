package jdk8_features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 流转换为其它数据结构:
 */
public class StreamToOthers {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a", "b", "c");

        // 1. stream to array
        String[] strArray1 = stream.toArray(String[]::new);

        // 2. stream to collection
        List<String> list1 = stream.collect(Collectors.toList());
        List<String> list2 = stream.collect(Collectors.toCollection(ArrayList::new));
        Set set1 = stream.collect(Collectors.toSet());
        Stack stack1 = stream.collect(Collectors.toCollection(Stack::new));

        // 3. stream to string
        String str = stream.collect(Collectors.joining()).toString();
    }
}
