package hash;

/**
 * Valid Anagram
 *
 * @see <a href="https://leetcode.com/problems/valid-anagram/description/">source</a>
 * @author LiDaQian
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] hashTable = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hashTable[s.charAt(i) - 'a']++;
            hashTable[t.charAt(i) - 'a']--;
        }
        for (int i : hashTable) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}
