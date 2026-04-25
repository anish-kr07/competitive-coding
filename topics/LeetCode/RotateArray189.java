package LeetCode;

import java.util.Arrays;

public class RotateArray189 {
    public static void rotate(int[] nums, int k) {
        int l = nums.length;
        //if k is more than length
        k = k%l;
        //Time:O(n) Spac: O(n)
        // int[] copyArr = nums.clone();
        // for(int i = 0; i < l;i++){
        //     int index = (i+k)%l;
        //     nums[index] = copyArr[i];
        // }
        // System.out.print(Arrays.toString(copyArr));

        reverse(nums, 0, l-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, l-1);

    }

    private static void reverse(int[] nums, int start, int end){
        while(start < end ){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++; end--;
        }
    }
}

class TestRotateArray189{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("Initial: " + Arrays.toString(arr));
        RotateArray189.rotate(arr,3);
        System.out.println("Final:   " + Arrays.toString(arr));
    }
}
