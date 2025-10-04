import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> m = new HashMap<>(); // char → last index
        int maxVal = 0;
        int i = 0; // left pointer

        for (int j = 0; j < s.length(); j++) { // right pointer
            char c = s.charAt(j);

            // If char is already in window, move i past last occurrence
            if (m.containsKey(c)) {
                i = Math.max(m.get(c) + 1, i);
            }

            m.put(c, j); // update last seen index of char
            maxVal = Math.max(maxVal, j - i + 1);
        }

        return maxVal;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "abcabcbb";
        System.out.println(sol.lengthOfLongestSubstring(s)); // Output: 3
    }
}
