package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumbersSmallerThanCurrentNumber1365 {
    public static void main(String[] args) {
    int result[] = smallerNumbersThanCurrent(new int[]{8,1,2,2,3});
        System.out.println(Arrays.toString(result));
    }

    public  static int[] smallerNumbersThanCurrent(int[] nums) {
        int copy []  = nums.clone();
        Arrays.sort(copy);
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(copy[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            copy[i] = map.get(nums[i]);
        }
        return copy;
    }
}
