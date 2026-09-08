class Solution {
    public boolean isAnagram(String s, String t) {

        // Anagrams must have the same number of characters
        if (s.length() != t.length()) {
            return false;
        }

        // 26 positions: index 0 = 'a', 1 = 'b', ... 25 = 'z'
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {

            // Convert the character into an array index and ADD 1 for s
            // Example: 'c' - 'a' = 2 → count[2]++
            count[s.charAt(i) - 'a']++;

            // Convert the character into an array index and SUBTRACT 1 for t
            // If s and t have the same frequency, these values will cancel to 0
            count[t.charAt(i) - 'a']--;
        }

        // Check all 26 letters to make sure every count balanced to 0
        for (int i = 0; i < 26; i++) {

            // A non-zero count means that letter appeared a different
            // number of times in s and t
            if (count[i] != 0) {
                return false;
            }
        }

        // Every character had the same frequency → they are anagrams
        return true;
    }
}