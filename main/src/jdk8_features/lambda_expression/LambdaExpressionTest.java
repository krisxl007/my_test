package jdk8_features.lambda_expression;

/**
 * Lambda表达式的格式为"(参数1,参数2...) -> {方法体重写}"，箭头左边是接口方法的参数，右边是具体实现
 * Lambda表达式的作用:就是简化了匿名内部类的写法，但是用Lambda表达式需要有Functional Interface的
 * 支持(接口有且只有一个抽象方法)，否则表达式不知道重写的是哪个方法
 *
 * 此外，Lambda表达式还有一种特殊的形式 - 方法调用(用符合"::")
 */
public class LambdaExpressionTest {
    public static void main(String[] args) {
        //箭头左边的s代表接口LambdaFunctionalInterface中method方法的参数，右边是具体实现
        LambdaFunctionalInterface lambdaFunctionalInterface = s -> System.out.println("Hello " + s);
        print("Kris", lambdaFunctionalInterface);
        print("Katie", lambdaFunctionalInterface);

        //Lambda的方法调用，相当于s -> Integer.parseInt(s);
        LambdaFunctionalInterface2 lambdaFunctionalInterface2 = Integer::parseInt;
        convert("100", lambdaFunctionalInterface2);
        convert("200", lambdaFunctionalInterface2);

    }

    private static void print(String str, LambdaFunctionalInterface lambdaFunctionalInterface) {
        lambdaFunctionalInterface.method(str);
    }

    private static void convert(String str, LambdaFunctionalInterface2 lambdaFunctionalInterface2) {
        System.out.println("String to Integer converted successfully：" + lambdaFunctionalInterface2.method(str));
    }
}
