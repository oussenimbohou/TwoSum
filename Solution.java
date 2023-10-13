import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] nums = new int[]{2, 5, 5, 11};
        int target = 10;
        Solution sum = new Solution();
        System.out.println("{i, j} = " + Arrays.toString(sum.twoSum(nums, target)));
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
}