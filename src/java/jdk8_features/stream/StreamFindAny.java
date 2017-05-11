package jdk8_features.stream;

import java.util.Arrays;
import java.util.List;

/**
 *  method can find any element from stream. It returns Optional instance.
 *  If there is no data in stream, it returns empty Optional instance
 */
public class StreamFindAny {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AA","BB","CC");
        list.stream().findAny().ifPresent(s->System.out.println(s));
    }
}