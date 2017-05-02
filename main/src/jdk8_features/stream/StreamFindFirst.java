package jdk8_features.stream;

import java.util.Arrays;
import java.util.List;

/**
 *  returns first element of the stream and if stream has defined no encounter order,
 *  then it may return any element. If stream is empty, it returns empty Optional instance.
 */
public class StreamFindFirst {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("XX","YY","ZZ");
        list.stream().findFirst().ifPresent(s->System.out.println(s));
    }
}