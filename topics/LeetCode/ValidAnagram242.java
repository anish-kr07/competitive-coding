package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram242 {
    public static boolean isAnagram(String s, String t) {
        String sModified = s.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

        char[] ch = t.toCharArray();
        Arrays.sort(ch);
        String tModified = new String(ch);
        System.out.println("sorted1 " + sModified);
        System.out.println("sorted2 " + tModified);
        return sModified.equals(tModified);

    }
    public static boolean isAnagramOptmized(String s, String t){
        Map<Character, Integer> hasMap =  new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(hasMap.containsKey(ch))
                hasMap.put(ch, hasMap.get(ch)+1);
            else
                hasMap.put(ch, 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if(!hasMap.containsKey(ch))
                return false;
            else {
                if(hasMap.get(ch) == 1 )
                    hasMap.remove(ch);
                else
                    hasMap.put(ch, hasMap.get(ch)-1);
            }
        }

        return hasMap.isEmpty();
    }
}

class TestValidAnagram242{
    public static void main(String[] args) {
        System.out.println(ValidAnagram242.isAnagram("anagram", "nagaram"));
        System.out.println(ValidAnagram242.isAnagramOptmized("anagram", "nagaram"));
        System.out.println(ValidAnagram242.isAnagramOptmized("rat", "car"));
    }
}

