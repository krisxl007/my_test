package jdk8_features.interface_new_features.functional_interface;

/**
 * Functional Interface就是有且仅有一个抽象方法的接口，可以用注解@FunctionalInterface来限制,它
 * 的作用就是为了更方便的给Lambda表达式调用(调用方式见FunctionalInterfaceTest类)
 * @param <T>
 */
@FunctionalInterface
public interface MyFunctionalInterface<T> {

    //abstract关键字是默认的，可以省略
    boolean test(T t);

    /*
    此外在Functional Interface中还可以有其他的static和default方法
     */
    static void staticMethod() {
        System.out.println("I am interface static method");
    }

    default void defaultMethod() {
        System.out.println("I am interface default method");
    }
}
