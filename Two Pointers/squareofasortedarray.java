/*
Problem: Square of a Sorted Array
LeetCode #: 977
Difficulty: Easy

Pattern: Two Pointers
Approach: The naive way is square everything then sort → O(n log n). We can do better.
          The array is sorted, so the largest squares always come from either the leftmost (most negative) or rightmost (largest positive) end.
          So we use two pointers from both ends, always picking the larger absolute value, and fill the result array from right to left.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1;
        int pos = nums.length - 1;
        int[]result = new int [nums.length];

        while (left <= right){
            int leftsq = nums[left] * nums[left];
            int rightsq = nums[right] * nums[right];

            if (leftsq > rightsq){
                result [pos] = leftsq;
                left++;
            } else {
                result [pos] = rightsq;
                right--;
            }
            pos--;
        }
        return result;
    }
}