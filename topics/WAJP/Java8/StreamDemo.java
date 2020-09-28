package WAJP.Java8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) throws IOException {
        IntStream.range(1,9).forEach(System.out::print);

        System.out.println();

        IntStream.range(1,9)
                .skip(5).forEach(x -> System.out.print(x));

        System.out.println();

        Stream.of("Anish","Rohit","kk")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        List<String> name = Arrays.asList("Anish","KK","Rohit","Kumar");
        name.stream().filter(str -> str.startsWith("K"))
                .map(String::toLowerCase)
                .forEach(x -> System.out.println(x));

        Stream<String> lines = Files.lines(Paths.get("./topics/WAJP/Java8/data.txt"));
        Map<String,Integer> map = new HashMap<>();
        map = lines.map(x -> x.split(","))
                .filter(x -> x.length == 4)
                .filter(x -> Integer.parseInt(x[1]) > 14)
                .collect(Collectors.toMap(
                        x -> x[0],
                        x -> Integer.parseInt(x[1])
                ));
        for (String key : map.keySet()){
            System.out.println(key + "  " + map.get(key));
        }

        System.out.println();

        double total = Stream.of(10.0,100.0,50.5)
                        .reduce(1000.0,(Double a,Double b) -> a+b);
        System.out.println(total);

        double total1 = DoubleStream.of(10.0,100.0,50.5)
                .reduce(1000.0,( a,b) -> a+b);
        System.out.println(total1);

        DoubleSummaryStatistics summary = DoubleStream.of(10.0,100.0,50.5)
                                        .summaryStatistics();
        System.out.println(summary);
    }
}
