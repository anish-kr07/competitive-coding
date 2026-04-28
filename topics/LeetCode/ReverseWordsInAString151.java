package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWordsInAString151 {
    public static String reverseWords(String s) {
//        String[] str = s.trim().split("\\s+");
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = str.length-1; i >= 0 ; i--) {
//            stringBuilder.append(str[i] + " ");
//        }
//        return stringBuilder.toString().trim();

        List<String> list = Arrays.asList(s.trim().split("\\s+"));
        Collections.reverse(list);
        return list.stream().collect(Collectors.joining(" "));

    }
    public  static String reverseWordsAndReverseEachCharacterinWords(String s) {
//        String[] str = s.trim().split("\\s+");
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = str.length-1; i >= 0 ; i--) {
//            StringBuilder reverse = new StringBuilder(str[i]).reverse();
//            stringBuilder.append(reverse + " ");
//        }
//        return stringBuilder.toString().trim();
        List<String> list = Arrays.asList(s.trim().split("\\s+"));
        Collections.reverse(list);
        return list.stream().map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}

class TestReverseWordsInAString151{
    public static void main(String[] args) {
        String str = ReverseWordsInAString151.reverseWords("My name is ANISH    KUMAR ");
        System.out.println("Input1: My name is ANISH    KUMAR  ");
        System.out.println("Output1: "+ str);

        String str1 = ReverseWordsInAString151.reverseWordsAndReverseEachCharacterinWords("My name is ANISH    KUMAR ");
        System.out.println("Input2: My name is ANISH    KUMAR  ");
        System.out.println("Output2: "+ str1);
    }
}