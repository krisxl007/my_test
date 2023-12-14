package jdk8_features.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * peek()和forEach()都是用来执行一个方法区别，他们都区别是:
 *  - peek()是intermediate操作，执行完后Stream还可以继续操作
 *  - forEach()是terminal操作，执行完后就结束了
 */
public class StreamPeek {

    public static void main(String[] args) {
        List<String> list = Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e)) // filter之后仍然可以打印
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e)) // map之后仍然可以打印
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
