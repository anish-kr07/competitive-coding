package LeetCode;

public class SearchInsertPosition35 {
    public static void main(String[] args) {
        SearchInsertPosition35 obj = new SearchInsertPosition35();
        System.out.println(obj.searchInsert(new int[]{1,3,5,6},7));
    }
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0) return 1;
        int low = 0 , high = nums.length-1,mid = 0;
        while (low <= high) {
            mid = low + (high -low)/2;
            if(nums[mid] == target) return  mid;
            if(nums[mid] < target) low = mid+1;
            if(nums[mid] > target) high = mid-1;
        }
        return low;
    }
}
