class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int curr_end = 0;
        int fast = 0;
        int n = nums.length;

        for(int i=0;i<n-1;i++){
            fast = Math.max(fast,i+nums[i]);

            if(i==curr_end){
                jump++;
                curr_end = fast;
            }
        }
        return jump;
    }
}