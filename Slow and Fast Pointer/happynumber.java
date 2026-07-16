/*  LC - 202
    Happy Number
    Level - Easy
    Approach - Slow and Fast Pointer

    A number is called Happy if:

    1. Replace the number by the sum of the squares of its digits.
    2. Repeat the process.
    3. If it eventually becomes 1, return true.
    4. If it enters a cycle (never reaches 1), return false.

    Remember this mapping
    Linked List	     Happy Number
    slow.next	     getNext(slow)
    fast.next.next	 getNext(getNext(fast))
    ListNode	     int
    next pointer	 Sum of squares of digits

Think of getNext(n) as the equivalent of n.next for the Happy Number problem. That's the key idea behind using Floyd's Cycle Detection here.
*/

public class happynumber {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while (true){

            slow = getNext(slow);
            fast = getNext(getNext(fast));

            if (fast == 1)
            return true;

            if (slow == fast)
            return false;
        }
    }

    private int getNext(int n){

        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
}