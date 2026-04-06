package LeetCode;

import java.util.Arrays;

public class MissingNumber268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
//        int sum = Arrays.stream(nums).sum();
//        int expectedSum = (n * ((n + 1)) / 2);
//        int result = expectedSum - sum;
//        return result;
        int res=0;
        for(int i =0; i<n; i++){
            res += i - nums[i];
        }
        return res+n;
    }
}
class TestMissingNumber268 {
    public static void main(String[] args) {
        MissingNumber268 missingNumber268 = new MissingNumber268();
        int result = missingNumber268.missingNumber((new int[]{0,1}));
        System.out.println(result);
    }
}
