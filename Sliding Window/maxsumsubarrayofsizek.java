/* GFG - Maximum Sum of Subarray of Size K
Pattern - Sliding Window 
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class maxsumsubarrayofsizek {
    public int maxSumOfSubarray(int[] arr, int k) {
        if (arr == null || k <= 0 || k > arr.length) {
            return 0;
        }

        int n = arr.length;

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}
