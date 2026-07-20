/*  LC - 1749
    Maximum Absolute Sum of Any Subarray
    Level - Medium
    Pattern - Kadane's Algorithm
    Approach - abs(sum) is maximized when sum is either:
                1. as LARGE as possible (max subarray sum)
                2. as SMALL (most negative) as possible (min subarray sum)

        Answer = max(abs(max subarray sum), abs(min subarray sum))
*/

public class maxabssumofanysubarray {
    public int maxAbsoluteSum(int[] nums) {

        int currentMax = nums[0], maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSum = Math.max(maxSum, currentMax);
        }

        int currentMin = nums[0], minSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMin = Math.min(nums[i], currentMin + nums[i]);
            minSum = Math.min(minSum, currentMin);
        }

        return Math.max(Math.abs(maxSum), Math.abs(minSum));
    }
}
