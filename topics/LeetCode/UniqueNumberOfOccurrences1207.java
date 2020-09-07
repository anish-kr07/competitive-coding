package LeetCode;

import java.util.*;

public class UniqueNumberOfOccurrences1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            if(map.get(i) == null)
                map.put(i,0);
            else
                map.put(i,map.get(i)+1);
        }
        // List<Integer> keyList = new ArrayList(map.keySet());
        List<Integer> valueList = new ArrayList(map.values());
        Set<Integer> set = new HashSet<>();
        for(int i : valueList){
            if(set.add(i) == false){
                return false;
            }
        }
        return true;
    }
}
