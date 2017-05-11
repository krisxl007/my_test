package jdk8_features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * stream中map的作用就是把 input Stream 的每一个元素，映射成 output Stream 的另外一个元素。
 */
public class StreamMap {
    public static void main(String[] args) {

        // to upper case
        List<String> wordList = Arrays.asList("a", "b", "c");
        List<String> output = wordList.stream().
                map(String::toUpperCase).
                collect(Collectors.toList());
        System.out.println(wordList + " -> " + output);

        // to squire value
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        List<Integer> squareNums = nums.stream().
                map(n -> n * n).
                collect(Collectors.toList());
        System.out.println(nums + " -> " + squareNums);

        // flatMap: flatMap 把 input Stream 中的层级结构扁平化，就是将最底层元素抽出来放
        // 到一起，最终 output 的新 Stream 里面已经没有 List 了，都是直接的数字
        Stream<List<Integer>> inputStream = Stream.of(
                Arrays.asList(1),
                Arrays.asList(2, 3),
                Arrays.asList(4, 5, 6)
        );
        Stream<Integer> outputStream = inputStream.
                flatMap((childList) -> childList.stream());
        System.out.println(outputStream);
    }
}
