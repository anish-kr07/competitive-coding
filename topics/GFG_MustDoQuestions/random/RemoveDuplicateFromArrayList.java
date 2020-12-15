package GFG_MustDoQuestions.random;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateFromArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(0,1,2,3,0,3,-1));
        //Order not maintained
        List<Integer> removedList = new ArrayList<>(
                new HashSet<>(list)
        );
        System.out.println("removedList "+removedList);

        //Order maintained with stream
        List<Integer> removeWithStream = list.stream().distinct().collect(Collectors.toList());
        System.out.println("removeWithStream " + removeWithStream);

        //Order maintained with stream
        List<Integer> removeWithLinkedHasSet = new ArrayList<>(
                new LinkedHashSet<>(list)
        );
        System.out.println("removeWithLinkedHasSet "+ removeWithLinkedHasSet );

        char[] ch = "leetCode".toCharArray();
        String str = "leetcode";
//        Stream<Character> stream = str.chars();
        int xtream = str.chars()
            .distinct()
            .findFirst().getAsInt();

        System.out.println("Character is " + (char)xtream);
//        Stream.of('l','e','e')
//                .distinct()
//                .peek(System.out::println)
//                .findFirst()
//                .ifPresent(System.out::println);
    }
}
