package jdk8_features.stream;

import java.util.stream.Stream;

/**
 * Reduce方法用来给Stream产生一个给定的操作，当第一个参数不为空时，返回具体的对象，当
 * 为空时，则返回一个Optional
 */
public class StreamReduce {
    public static void main(String[] args) {

        // 字符串连接，concat = "ABCD"
        String concat = Stream.of("A", "B", "C", "D").reduce("", String::concat);
        System.out.println(concat);

        // 求最小值，minValue = -3.0
        double minValue = Stream.of(-1.5, 1.0, -3.0, -2.0).reduce(Double.MAX_VALUE, Double::min);
        System.out.println(minValue);

        // 求和，sumValue = 10, 有起始值
        int sumValue = Stream.of(1, 2, 3, 4).reduce(0, Integer::sum);
        System.out.println(sumValue);

        // 求和，sumValue2 = 10, 无起始值, 返回的是Optional, 可以用get来获取
        int sumValue2 = Stream.of(1, 2, 3, 4).reduce(Integer::sum).get();
        System.out.println(sumValue2);

        // 过滤，字符串连接，concat = "ace"
        String concat2 = Stream.of("a", "B", "c", "D", "e", "F").
                filter(x -> x.compareTo("Z") > 0).
                reduce("", String::concat);
        System.out.println(concat2);
    }
}