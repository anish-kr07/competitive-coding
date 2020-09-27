package WAJP.Java8;

import java.util.function.Consumer;

public class ConsumerAcceptDemo {
    public static void main(String[] args) {
        Consumer<String> consumer = str -> System.out.println(str);
        Consumer<String> consumer1 = str -> System.out.println(str.length());
        Consumer<String> consumerSummation = consumer.andThen(consumer1);
        consumer.accept("anish");
        consumer.andThen(consumer1).accept("Anish Kumar");
        consumerSummation.accept("Summation");
    }
}
