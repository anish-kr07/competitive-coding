import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hasMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hasMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int second = target - nums[i];
            if (hasMap.containsKey(second) && hasMap.get(second) != i) {
                return new int[]{i, hasMap.get(second)};
            }
        }

        throw new IllegalArgumentException("NO number found");

    }
}
