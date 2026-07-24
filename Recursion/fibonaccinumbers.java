/*  LC - 509
    Fibonacci Number
    Level - Easy
    Pattern - Recursion

    Time Complexity - O(2^n)
    Space Complexity - O(n)
*/

public class FibonacciNumbers {
    public int fib(int n) {
        if (n==0)
            return 0;
        if (n==1)
            return 1;

        int ans1 = fib(n-1);
        int ans2 = fib(n-2);
        return ans1 + ans2;
    }
}