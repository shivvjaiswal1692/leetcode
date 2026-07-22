/*  LC - 409
    Level - Easy
    Pattern - HashMaps
    Approach - A palindrome uses characters symmetrically:
                1. EVEN frequency chars → use ALL of them       (e.g. "cccc" → "cc_cc")
                2. ODD frequency chars  → use count-1 of them   (e.g. "ddd" → "dd_dd")
                3. ONE odd char         → place in CENTER        (e.g. "dccaccd")

    So: result = sum of all even counts + sum of (odd counts - 1) + 1 if ANY odd count exists (center character)
*/

public class longestpalindrome {
    public int longestPalindrome(String s) {

        int[] freq = new int[128];

        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        int length = 0;
        boolean hasOdd = false;

        for (int count : freq) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                hasOdd = true;
            }
        }

        if (hasOdd) {
            length++;
        }

        return length;
    }
}
