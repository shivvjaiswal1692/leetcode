/*  LC - 383
    Ransom Note
    Pattern - HashMap
    Level - Easy

    Approach -  1. Count the frequency of each character in magazine.
                2. For each character in ransomNote:
                    i) If its not available (freq = 0), return false
                    ii) Otherwise, use it up (freq --)
                3. If all character is satsfied, return true    
*/

public class ransomnote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for (char c : magazine.toCharArray()){
            freq [c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()){
            freq [c - 'a']--;
            if (freq [c - 'a']<0){
                return false;
            }
        }
        return true;
    }
}
