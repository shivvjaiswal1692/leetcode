/*  LC - 142
    Linked List Cycle II
    Level - Medium
    Approach - Slow and Fast Pointer
*/

package Slow and Fast Pointer;

public class linkedlistcycleii {
    public ListNode detectCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                
                ListNode ptr = head;
                while(ptr != slow){
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;
    }
}
