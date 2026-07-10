/*  LC - 424 Longest Repeating Character Replacement
    Level - Medium
    Pattern - Sliding Window
    Approach - A window is VALID if:
                (window size) - (count of most frequent char) <= k
                Because: characters to replace = window size - most frequent char count
                If that's <= k, we can make the whole window one character
    Time Complexity - O(n)
    Space Complexity - O(1)
*/

import java.util.HashMap;

public class longestrepeatingcharacerreplacement {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(ch));

            while ((right - left + 1) - maxFreq > k) {

                char leftChar = s.charAt(left);

                map.put(leftChar, map.get(leftChar) - 1);

                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
