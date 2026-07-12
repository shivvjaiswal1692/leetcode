/*
    LC - 1004 Max Consecutive Ones III
    Level - Medium
    Pattern - Sliding Window
    Approach - A window is VALID if:
                (count of zeros in window) <= k
                Because: we can flip at most k zeros to ones

                Expand by moving right.
                Whenever you see a 0, increment zeroCount.
                If zeroCount > k, shrink from the left until zeroCount <= k.
                Update the maximum window size.

    Time Complexity - O(n)
    Space Complexity - O(1)
*/

public class maxconsecutiveonesiii {
    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0)
                zeroCount++;

            while (zeroCount > k) {

                if (nums[left] == 0)
                    zeroCount--;

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}