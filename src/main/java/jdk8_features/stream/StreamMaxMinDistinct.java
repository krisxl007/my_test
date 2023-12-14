package jdk8_features.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * max() method returns maximum element on the basis of given comparator. It returns Optional instance.
 * <p>
 * min() method returns minimum element on the basis of given comparator. It returns Optional instance.
 */
public class StreamMaxMinDistinct {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("G", "B", "F", "E");
        List<Integer> list2 = Arrays.asList(2, 1, 2, 3, 5, 4, 3);

        // 最大值
        String max = list.stream().max(Comparator.comparing(String::valueOf)).get();
        System.out.println("Max: " + max);

        // 最小值
        String min = list.stream().min(Comparator.comparing(String::valueOf)).get();
        System.out.println("Min: " + min);

        // 去重复
        List<Integer> distList = list2.stream().distinct().collect(Collectors.toList());
        System.out.println("distList: " + distList);
    }
}
