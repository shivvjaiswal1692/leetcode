/* LC - 03
   Longest Substring Without Repeating Characters
   Level - Medium
   Pattern - Sliding Window
   Approach - Expand by moving right.
              Store the frequency of every character in a HashMap.
              If any character appears more than once, shrink from the left until every character becomes unique again.
              Update the maximum window length. 
    Time Complexity - O(n)
    Space Complexity - O(n)
*/

import java.util.HashMap;

public class longestsubstringwithoutrepeatingcharacters {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.get(ch) > 1) {
                char leftChar = s.charAt(left);

                map.put(leftChar, map.get(leftChar) - 1);

                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
