/*  GFG - Sum of digits of a number using recursion
    Level - Easy
    Pattern - Recursion
    Approach - int fun (0)
                Base Case: if (n==0) return 0;
                Recusrion: lastDigit = n%10;
                            remaining = n/10;
                            return lastDigit + fun(remaining);
*/

public class sumofdigits {
    public int digitSum(int n){
        if (n == 0){
            return 0;
        }
        int lastDigit = n%10;
        int ans = digitSum(n / 10);

        return ans + lastDigit;
        }
    }

