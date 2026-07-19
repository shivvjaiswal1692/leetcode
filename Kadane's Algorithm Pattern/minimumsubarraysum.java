/*    GFG - Minimum Subarray Sum
    Level - Medium
    Pattern - Kadane's Algorithm
    Approach - Same as maximum subarray, just flip the logic.
                1. Instead of keeping the sum if it helps positive, keep the sum if it helps negative.
                2. Instead of max, use min everywhere.
                
    currentsum = min(nums[i], currentsum + nums[i])

    Start fresh when currentsum becomes positive.
*/

public class minimumsubarraysum {
    public int minimumSubarraySum(int [] nums, int n) {
        
        int currentsum = nums[0];
        int minsum = nums[0];
        
        for (int i = 1; i < nums.length; i++){
            
            int V1 = currentsum + nums[i];
            int V2 = nums[i];
            
            currentsum = Math.min (V1 , V2);
            minsum = Math.min(currentsum , minsum);
        }
        return minsum;
    }
}