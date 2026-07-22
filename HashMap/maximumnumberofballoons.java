/*  LC - 1189
    Maximum Number of Balloons
    Level - Easy
    Pattern - HashMap
    Approach - 1. Count the number of frequency of each character.
               2. Determine how many balloons each character can form.

    NOTE:   The character 'l' and 'o' appears two times in the word "balloon".
            So, divide the frequency of 'l' and 'o' by 2 to get the number of balloons that can be formed.       
            
                3. Return the minimum.
*/

public class maximumnumberofballoons {
    public int maxNumberOfBalloons(String text) {

        int[] freq = new int[26];

        for (char ch : text.toCharArray()) {
            freq[ch - 'a']++;
        }

        int b = freq['b' - 'a'];
        int a = freq['a' - 'a'];
        int l = freq['l' - 'a'] / 2;
        int o = freq['o' - 'a'] / 2;
        int n = freq['n' - 'a'];

        return Math.min(Math.min(b, a), Math.min(Math.min(l, o), n));
    }
}
