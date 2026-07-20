/*  LC - 1186
    Maximum Subarray Sum with One Deletion
    Level - Medium
    Pattern - Kadane's Algorithm
    Approach - Think of running 2 kadane's algorithm side by side:
                1. noDelete - maximum subarray sumending at i with NO deletion used.
                2. oneDelete - maximum subarray sum ending at i with ONE deletion used.

    noDelete[i] = max(nums[i], noDelete[i-1] + nums[i]
    oneDelete[i] = max(noDelete[i-1], oneDelete[i-1] + nums[i])
*/    

public class maximumsubarraysumwithonedeletion {
     public int maximumSum(int[] nums) {

        int noDelete = nums[0];
        int oneDelete = 0;
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int prevNoDelete = noDelete;

            noDelete = Math.max(nums[i], noDelete + nums[i]);
            oneDelete = Math.max(prevNoDelete, oneDelete + nums[i]);

            ans = Math.max(ans, Math.max(noDelete, oneDelete));
        }

        return ans;
    }
}