package jdk8_features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * map(): 就是转化，把input Stream的每一个元素，转化成另一个形态
 * flatMap(): 把input Stream中的层级结构扁平化，就是将最底层元素抽出来放到一起，最终output的新Stream里面已经没有List了，都是直接的数字
 */
public class StreamMapAndFlatMap {

    public static void main(String[] args) {

        // map all elements to upper case
        List<String> wordList = Arrays.asList("a", "b", "c");
        List<String> output = wordList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(wordList + " -> " + output);

        // map all elements to squire value
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        List<Integer> squareNums = nums.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(nums + " -> " + squareNums);

        // flatMap
        Stream<List<Integer>> inputStream = Stream.of(
                Arrays.asList(1),
                Arrays.asList(2, 3),
                Arrays.asList(4, 5, 6)
        );
        Stream<Integer> outputStream = inputStream.flatMap(childList -> childList.stream());
        System.out.println(outputStream);
    }
}
