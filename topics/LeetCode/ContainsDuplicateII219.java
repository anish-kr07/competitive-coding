package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ContainsDuplicateII219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer>  map = new HashMap<>();
        int currentIndex =0;
        for ( int i : nums){
            if(map.containsKey(i) && Math.abs(currentIndex - map.get(i)) <= k)
                return true ;
            map.put(i,currentIndex);
            currentIndex++;
        }
        return false;
    }
}

class  TestContainsDuplicateII219 {
    public static void main(String[] args) {
        ContainsDuplicateII219 obj = new ContainsDuplicateII219();
        boolean result = obj.containsNearbyDuplicate(new int[]{1,2,3,1,1,3},2);
        System.out.println(result);
    }
}