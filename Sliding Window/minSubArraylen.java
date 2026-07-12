/* LeetCode - 209
    Minimum Size Subarray Sum
    Level - Medium
    Approach - Sliding Window 
    Time Complexity - O(n)
    Space Complexity - O(1)
*/

public class minSubArraylen {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++){
            sum += nums[right];

            while (sum >= target){
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;

    }
}