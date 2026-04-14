package LeetCode;

import java.util.Arrays;

public class HouseRobber198 {
    static int[] memo;
    public static int robRecursion(int[] arr, int i) {
        if(i < 0)
            return 0;
        if(memo[i] != -1)
            return memo[i];

        int result = Math.max(robRecursion(arr, i-2) + arr[i] , robRecursion(arr,i-1));
        memo[i] = result;
        return result;
    }

    public static int rob(int[] nums) {
        int n = nums.length;
        //iterative apprach
//         if (n == 1)
//             return nums[0];
//         int dp[] = new int[n];
//         dp[0] = nums[0];
//         dp[1] = Math.max(nums[0], nums[1]);
//        for (int i = 2; i < n ; i++) {
//            dp[i] = Math.max(dp[i-2]+ nums[i], dp[i-1]);
//        }
//        return dp[n-1];

        //recursive approach
        memo= new int[n];
        Arrays.fill(memo, -1);
        return robRecursion(nums, n-1);

    }


}

class TestHouseRobber198 {
    public static void main(String[] args) {
        int output = HouseRobber198.rob(new int[]{2, 7, 9, 3, 1});
        System.out.println("result "+ output);
    }
}
