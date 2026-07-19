/*  LC - 152
    Maximum Product Subarray
    Level - Medium
    Pattern - Kadane's Algorithm
    Approach - Unlike sum, product has a twist
                A large negative number can become a large positive number if multiplied by another negative number.
                So we need to keep track of both the maximum and minimum product at each index.

    At every step, there are 3 options:
        1. nums[i] alone -> start fresh subarray
        2. max * nums[i] -> extend the previous maximum product subarray
        3. min * nums[i] -> extend the previous minimum product subarray (which could become maximum if nums[i] is negative)

    Time Complexity - O(n)
    Space Complexity - O(1)
*/

public class maximumproductsubarray {
        public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int V1 = nums[i];
            int V2 = max * nums[i];
            int V3 = min * nums[i];

            max = Math.max(V1, Math.max(V2 , V3));
            min = Math.min(V1, Math.min(V2 , V3));

            ans = Math.max(ans , max);
        }
        return ans;
    }
}
