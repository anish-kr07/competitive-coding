package LeetCode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class TwoSum1 {
    public int[] twoSum(int[] nums , int target){
        int remainder;
        for(int line = 0; line< nums.length; line++){
            remainder = target - nums[line];
            for(int i =line+1; i< nums.length;i++){
                if (nums[i] == remainder){
                    return new int[]{line,i};
                }
            }
        }
        throw new IllegalArgumentException("NO correct answer for "+ target);
    }
    public int[] twoSumOptimized(int[] nums, int target){
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if(hashMap.containsKey(remainder) && hashMap.get(remainder) != i)
                return new int[]{i, hashMap.get(remainder)};
        }
        throw new IllegalArgumentException("No solution");
    }
}
class TestTwoSum1 {
    public static void main(String[] args) throws IOException {
     TwoSum1 obj = new TwoSum1();
     int[] output=obj.twoSum(new int[]{2,7,11,15}, 9);
     System.out.println("Result" + Arrays.toString(output));


     System.out.println("Lets take 2 input Integer array and target sum");
     BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input size of the array");
        int n = Integer.parseInt(buff.readLine());
        int arr[] = new int[n];
        System.out.print("Enter " + n + " elements (space-separated): ");
        String[] str = buff.readLine().trim().split(" ");
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        System.out.println("You entered: " + Arrays.toString(arr));

        int target = Integer.parseInt(buff.readLine());
        int result[]= obj.twoSum(arr, target);
        System.out.println("Result 2" + Arrays.toString(result));

        // Read and convert in one loop — no separate String[] needed
//        StringTokenizer st = new StringTokenizer(buff.readLine());
//        for (int i = 0; i < n; i++) {
//            nums[i] = Integer.parseInt(st.nextToken());
//        }
        // Approach 1: split() — simple but slower
//        String[] tokens = buff.readLine().trim().split(" ");
//        nums[i] = Integer.parseInt(tokens[i]);

// Approach 2: StringTokenizer — fastest, no extra array
//        StringTokenizer st = new StringTokenizer(buff.readLine());
//        nums[i] = Integer.parseInt(st.nextToken());

// Approach 3: Scanner — simplest syntax, slowest
//        Scanner sc = new Scanner(System.in);
//        nums[i] = sc.nextInt();  // hides conversion internally

        int[] outputOptmized =obj.twoSumOptimized(new int[]{2,7,11,15}, 9);
        System.out.println("Result Optmized" + Arrays.toString(outputOptmized));
    }
}

