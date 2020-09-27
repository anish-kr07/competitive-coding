package WAJP.Java8;

import java.util.function.Function;

public class FunctionApplyDemo {
    public static void main(String[] args) {
        Function<Integer,Integer> function =  i -> 2*i;
        Function<Integer,Integer> function1 =  i -> i*i*i;
        System.out.println(function.andThen(function1).apply(2));
        System.out.println(function.compose(function1).apply(2));
    }
}
