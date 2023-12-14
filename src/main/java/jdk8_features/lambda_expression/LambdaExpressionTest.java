package jdk8_features.lambda_expression;

/**
 * Lambda表达式的格式为"(参数1,参数2...) -> {方法体重写}"，箭头左边是接口方法的参数，右边是具体实现
 * Lambda表达式的作用:就是简化了匿名内部类的写法，但是用Lambda表达式需要有Functional Interface的
 * 支持(接口有且只有一个抽象方法)，否则表达式不知道重写的是哪个方法
 * <p>
 * 此外，Lambda表达式还有一种特殊的形式 - 方法调用(用符合"::")
 */
public class LambdaExpressionTest {

    public static void main(String[] args) {
        // 匿名类实例实现了LambdaFunctionalInterface接口的抽象方法
        LambdaFunctionalInterface lambdaFunctionalInterfaceImplementation1 = s -> System.out.println(
                "lambdaFunctionalInterfaceImplementation1: my name is " + s);
        LambdaFunctionalInterface lambdaFunctionalInterfaceImplementation2 = s -> System.out.println(
                "lambdaFunctionalInterfaceImplementation2: my name is " + s);

        print("Kris", lambdaFunctionalInterfaceImplementation1);
        print("Katie", lambdaFunctionalInterfaceImplementation2);

        // 由于只有一个抽象方法，匿名类实例知道要实现的LambdaFunctionalInterface2的抽象方法是哪个
        LambdaFunctionalInterface2 lambdaFunctionalInterface2Implementation1 = s -> System.out.println(
                "lambdaFunctionalInterface2Implementation1: my name is " + s);
        LambdaFunctionalInterface2 lambdaFunctionalInterface2Implementation2 = s -> System.out.println(
                "lambdaFunctionalInterface2Implementation2: my name is " + s);

        print2("Kris", lambdaFunctionalInterface2Implementation1);
        print2("Katie", lambdaFunctionalInterface2Implementation2);
    }

    private static void print(String str, LambdaFunctionalInterface lambdaFunctionalInterface) {
        lambdaFunctionalInterface.print(str);
    }

    private static void print2(String str, LambdaFunctionalInterface2 lambdaFunctionalInterface) {
        lambdaFunctionalInterface.print(str);
    }
}
