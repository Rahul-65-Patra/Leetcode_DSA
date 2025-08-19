class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        long currentStreak = 0;
        
        for (int num : nums) {
            if (num == 0) {
                currentStreak++;  // Increment the streak length
                ans += currentStreak;  // Add the streak contribution
            } 
            else {
                currentStreak = 0; // Reset the streak when non-zero is found
            }
        }
        
        return ans;
    }
}