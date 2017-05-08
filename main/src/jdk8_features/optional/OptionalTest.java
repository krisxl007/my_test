package jdk8_features.optional;

import java.util.Optional;

/**
 * 如果一个方法返回一个Object，那么我们在使用的时候总是要判断一下返回的结果是否为空，一般是这样的形式：

 if (a != null) {
 //do something...
 }

 但是简单的情况还好，如果复杂的情况下每一个都要去检查非常麻烦，而且写出来的代码也不好看、很臃肿，但是如果不检查就很容易遇到NullPointerException， Java8中的Optional就是为此而设计的。

 Optional一般使用在方法的返回值中，如果使用Optional来包装方法的返回值，这就表示方法的返回值可能为null，需要使用Optional提供的方法来检查，如果为null，还可以提供一个默认值。
 */
public class OptionalTest {

    public static void main(String[] args) {
        //创建Optional对象
        Optional<String> opt = Optional.empty();

        //依据一个非空值创建Optional，此值不能为null，否则将抛出NullPointerException
        Optional<String> opt2 = Optional.of("hello");

        //可接受null的Optional
        Optional<String> opt3 = Optional.ofNullable(null);

        //两个Optional的例子
        print(null);
        System.out.println(getLength(null));
    }

    private static void print(String text) {
        // Java 8
        Optional.ofNullable(text).ifPresent(System.out::println);
        // Pre-Java 8
        if (text != null) {
            System.out.println(text);
        }
    }

    private static int getLength(String text) {
        // Java 8
        return Optional.ofNullable(text).map(String::length).orElse(-1);
        // Pre-Java 8
        // return if (text != null) ? text.length() : -1;
    }
}
