import java.util.*;

class Solution {
    public String customSortString(String order, String s) {
        // Map each character in 'order' to its index for quick lookup
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }

        // Convert string to Character array for sorting
        Character[] chars = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        // Sort based on custom order
        Arrays.sort(chars, (a, b) -> {
            int indexA = map.getOrDefault(a, 26); // if not in order, put at the end
            int indexB = map.getOrDefault(b, 26);
            return indexA - indexB;
        });

        // Build the result
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            result.append(c);
        }

        return result.toString();
    }
}
