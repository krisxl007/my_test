package jdk8_features.stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 下面提供最常见的几种构造 Stream 的样例:
 *
 * 需要注意的是，对于基本数值型，目前有三种对应的包装类型 Stream：
 * IntStream、LongStream、DoubleStream。当然我们也可以用 Stream<Integer>、Stream<Long> >、Stream<Double>，但是 boxing 和 unboxing 会很耗时，所以特别为这三种基本数值型提供了对应的 Stream。
 * Java 8 中还没有提供其它数值型 Stream，因为这将导致扩增的内容较多。而常规的数值型聚合运算可以通过上面三种 Stream 进行。
 */
public class InitStream {
    public static void main(String[] args) {
        // 1. array to stream
        String [] strArray = new String[] {"a", "b", "c"};
        Stream stream1 = Stream.of("a", "b", "c");
        Stream stream2 = Stream.of(strArray);
        Stream stream3 = Arrays.stream(strArray);

        // 2. Collections stream() method
        List<String> list = Arrays.asList("a", "b", "c");
        Set<String> set = new HashSet<>(list);
        Stream stream4 = list.stream();
        Stream stream5 = set.stream();

        // 3. wrapped primitive stream
        IntStream stream6 = IntStream.of(new int[]{1, 2, 3});
        IntStream stream7 = IntStream.range(1, 5);
        IntStream stream8 = IntStream.rangeClosed(1, 5);

        // easy way to print out stream
        stream7.forEach(System.out::println);
    }
}
