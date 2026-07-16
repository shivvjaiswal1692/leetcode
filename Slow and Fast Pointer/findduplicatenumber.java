/*  LC - 287
    Find the Duplicate Number
    Level - Medium
    Approach - Slow and Fast Pointer
*/

package Slow and Fast Pointer;

public class findduplicatenumber {
    public int findDuplicate(int[] nums) {

        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
    
}
