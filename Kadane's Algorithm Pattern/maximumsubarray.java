/*  LC - 53
    Maximum Subarray
    Level - Medium
    Pattern - Kadane's Algorithm
    Approach - At each index, make onr decision:
                1. Extend the previous (currentsum / bestending) subarray or
                2. Start a fresh subarray from the current index.

    Currentsum = max(nums[i], currentsum + nums[i])

    If the running sum becomes negative, it only decreases the sum of any future subarray.
    So we drop it and start a fresh subarray from the current element.
    
    Time Complexity - O(n)
    Space Complexity - O(1)
*/

public class maximumsubarray {
    public int maxSubArray(int[] nums) {
        int currentsum =nums[0];
        int maxsum = nums[0];

        for (int i = 1; i < nums.length; i++) {  
            int V1 = currentsum + nums[i];
            int V2 = nums[i];

            currentsum = Math.max(V1, V2);
            maxsum = Math.max(currentsum, maxsum); 
        }

        return maxsum;
    }
}