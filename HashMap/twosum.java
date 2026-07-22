/*
Problem: Two Sum
LeetCode #: 1
Difficulty: Easy

Approach: HashMap

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashMap;

class twosum {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}