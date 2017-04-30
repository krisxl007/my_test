package jdk8_features;

/**
 * JDK8中的接口可以实现static和default方法,而默认的抽象方法不能有方法体
 */
public interface MyInterface {

    /**
     * static方法，直接用接口名来调用
     */
    static void staticMethod() {
        System.out.println("I am interface static method");
    }

    /**
     * default方法，由其实现类来调用, 实现类可以重写该方法
     */
    default void defaultMethod() {
        System.out.println("I am interface default method");
    }

    //其它的抽象方法不能有方法体
    void method1();
    void method2();
    void method3();
}
