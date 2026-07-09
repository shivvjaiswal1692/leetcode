/* GFG - Longest Substring with K Unique Characters
   Pattern: Sliding Window
   Approach: We maintain a window [left...right].

We'll use a HashMap to store the frequency of each character inside the window.

Expand the window by moving right.
If distinct characters become more than k, shrink from the left.
Whenever distinct characters become exactly k, update the answer.

   Time Complexity: O(n)
   Space Complexity: O(k) (at most 26 lowercase letters, so effectively O(1))
*/

import java.util.HashMap;

public class longestksubstr {
    public int longestKSubstr(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLen = -1;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() > k) {

                char leftChar = s.charAt(left);

                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0)
                    map.remove(leftChar);

                left++;
            }

            if (map.size() == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen;
    }
}
