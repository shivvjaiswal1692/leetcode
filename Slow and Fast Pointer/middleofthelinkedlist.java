/*  LC - 876
    Middle of the Linked List
    Level - Easy
    Approach - Slow and Fast Pointer
*/

package Slow and Fast Pointer;

public class middleofthelinkedlist {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
