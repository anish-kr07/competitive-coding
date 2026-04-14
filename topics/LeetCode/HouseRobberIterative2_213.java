package LeetCode;

import java.util.Arrays;

public class HouseRobberIterative2_213 {
    public static int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return nums[1];
        int[] memo = new int[n];
        Arrays.fill(memo,-1);
        int iter1 = robIterative(nums,0, n-1, memo);
        Arrays.fill(memo,-1);
        int iter2 = robIterative(nums,1, n, memo);

        return Math.max(iter1,iter2);

    }
    private static int robIterative(int[] arr, int start, int end, int[] memo){
        int prev1=0,prev2=0;
        for (int i = start; i <end ; i++) {
            int current = Math.max(prev1, prev2+arr[i]);
            prev2=prev1;
            prev1=current;
        }
        return prev1;
    }
}
class TestHouseRobberIterative2_213 {
    public static void main(String[] args) {
        int result = HouseRobberIterative2_213.rob(new int[]{1,2,3,1});
        System.out.println("result "+ result);
    }
}


