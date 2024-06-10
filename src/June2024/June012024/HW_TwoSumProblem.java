package June2024.June012024;

import java.util.*;

class HW_TwoSumProblem {
    public static void main(String[] args) {
        int[] nums = {1, 6,3, 15};
        System.out.println(Arrays.toString(twoSum(nums, 18)));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution found");
    }
}





