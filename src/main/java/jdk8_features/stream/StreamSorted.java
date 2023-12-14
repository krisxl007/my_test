package jdk8_features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 对 Stream 的排序通过 sorted 进行，它比数组的排序更强之处在于你可以首先对 Stream 进行各
 * 类 map、filter、limit、skip 甚至 distinct 来减少元素数量后，再排序，这能帮助程序明显缩短执行时间。
 */
public class StreamSorted {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 1, 5, 3);
        List<Integer> list2 = list.stream()
                .filter(n -> n > 2)
                .sorted(Integer::compareTo)
                .collect(Collectors.toList());
        System.out.println(list2);
    }
}
