class Solution {
    public int longestConsecutive(int[] nums) {
        Set <Integer> mySet= new HashSet<>();

        for(int num:nums){
            mySet.add(num);
        }

        int longestStreak=0;

        for(int num:mySet){
            if(!mySet.contains(num-1)){
                int currentNum= num;
                int currentStreak=1;

                  while(mySet.contains(currentNum+1)){
                currentNum++;
                currentStreak++;
            }
             longestStreak=Math.max(longestStreak, currentStreak);
            }
          
           
        }
        return longestStreak;
    }
}