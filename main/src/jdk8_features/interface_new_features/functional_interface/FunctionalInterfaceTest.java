package jdk8_features.interface_new_features.functional_interface;

import java.util.Arrays;
import java.util.List;

public class FunctionalInterfaceTest {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("输出所有数据:");
        eval(list, n -> true);

        System.out.println("输出所有偶数:");
        eval(list, n -> n%2 == 0 );

        System.out.println("输出大于 3 的所有数字:");
        eval(list, n -> n > 3 );
    }

    public static void eval(List<Integer> list, MyFunctionalInterface<Integer> myFunctionalInterface) {
        for(Integer i : list) {
            if(myFunctionalInterface.test(i)) {
                System.out.println(i + " ");
            }
        }
    }
}