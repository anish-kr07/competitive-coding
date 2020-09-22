package LeetCode;

import java.util.HashSet;

public class ContainsDuplicate217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for ( int i : nums){
            if(!hashSet.add(i))
                return true;
        }
        return false;
    }
}

class  TestContainsDuplicate217 {
    public static void main(String[] args) {
        ContainsDuplicate217 obj = new ContainsDuplicate217();
        boolean result = obj.containsDuplicate(new int[]{1,2,3,1});
        System.out.println(result);
    }
}