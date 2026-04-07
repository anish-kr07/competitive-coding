package LeetCode;

import java.util.*;

public class FindAllAnagramsInStringWithArrayList438 {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> output = new ArrayList<>();
        int[] frequency = new int[256];
        for (int i = 0; i < p.length(); i++) {
            frequency[p.charAt(i)]++;
        }
        //i < s.length()-p.length()+1 checks till the last window
        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            String str = s.substring(i, i + p.length());
            int[] copy = frequency.clone();  // copy original frequencies
            boolean check = checkAnagram(copy, str);
            if (check)
                output.add(i);
        }
        return output;

    }

    static boolean checkAnagram(int[] pFrequency, String s2) {
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if(pFrequency[ch] == 0 )
                return false;
            pFrequency[ch]--;
        }
        return true;
    }
}

class TestFindAllAnagramsInStringWithArrayList438 {
    public static void main(String[] args) {
        System.out.println("result " + FindAllAnagramsInStringWithArrayList438.findAnagrams("cbaebabacd", "abc"));
    }
}