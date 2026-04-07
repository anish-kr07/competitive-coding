package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInStringWithHasMap438 {
    public static List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> hasMapOriginal = new HashMap<>();
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            if (hasMapOriginal.containsKey(ch))
                hasMapOriginal.put(ch, hasMapOriginal.get(ch) + 1);
            else
                hasMapOriginal.put(ch, 1);
        }
        //i < s.length()-p.length()+1 checks till the last window
        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            String str = s.substring(i, i + p.length());

            //create duplicate as it pass by reference
            Map<Character, Integer> copy = new HashMap<>(hasMapOriginal);
            boolean check = checkAnagram(copy, str);
            if (check)
                output.add(i);
        }
        return output;

    }

    static boolean checkAnagram(Map<Character, Integer> hashMapDup, String s2) {
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (!hashMapDup.containsKey(ch))
                return false;
            else {
                if (hashMapDup.get(ch) == 0)
                    return false;
                else
                    hashMapDup.put(ch, hashMapDup.get(ch) - 1);
            }
        }
        return true;
    }

}

class TestFindAllAnagramsInStringWithHasMap438 {
    public static void main(String[] args) {
        System.out.println("result " + FindAllAnagramsInStringWithHasMap438.findAnagrams("cbaebabacd", "abc"));
    }
}
