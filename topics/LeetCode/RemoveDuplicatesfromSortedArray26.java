package LeetCode;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray26 {
    public static void main(String[] args) {

        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicatesfromSortedArray26 obj = new RemoveDuplicatesfromSortedArray26();
        System.out.println(obj.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int j = 0;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] != nums[j])
                nums[++j] = nums[i];
        }
        return j+1;
    }
}
