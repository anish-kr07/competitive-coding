package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
//        1 method
//        Map<Character,Integer> hashMap = new HashMap<>();
//        int totalJewels = 0;
//        for(Character ch : J.toCharArray()){
//            char ch = J.charAt(i);
//            hashMap.put(ch,0);
//        }
//        for(Character ch :S.toCharArray()){
//            char ch = S.charAt(i);
//            if(hashMap.get(ch) != null){
//                not required
//                hashMap.put(ch,hashMap.get(ch)+1);
//                totalJewels++;
//            }
//        }
//        return totalJewels;
//        2 method
//        Set<Character> set = new HashSet<>();
//        int totalJewels = 0;
//        for(Character ch : J.toCharArray()){
//            set.add(ch);
//        }
//        for(Character ch :S.toCharArray()){
//            if(set.contains(ch))
//                totalJewels++;
//        }
//        return totalJewels;
//        3 method
        int totalJewels = 0;
        for(Character ch :S.toCharArray()){
            if(J.contains(ch.toString()))
                totalJewels++;
        }
        return totalJewels;
    }
}
