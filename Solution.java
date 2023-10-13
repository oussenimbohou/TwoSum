import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        Solution sum = new Solution();
        System.out.println("{i, j} = " + Arrays.toString(sum.twoSumV1(nums, target)));
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return null;
    }
    public int[] twoSumV1(int[] nums, int target){
        Map<Integer, Integer> lookupTable = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            lookupTable.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int extra = target - nums[i];
            if(lookupTable.containsKey(extra) && lookupTable.get(extra) != i){
                return new int[]{i, lookupTable.get(extra)};
            }
        }
        return  null;
    }
}