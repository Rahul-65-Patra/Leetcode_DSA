class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        
        if (nums.empty()) return 0;

        int count=1;
        int maxVal = 1;

        sort(nums.begin(),nums.end());

        for(int i=1;i<nums.size();i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            else if(nums[i]==nums[i-1]+1){
                count++;
            }
            else{
                maxVal = max(maxVal,count);
                count=1;
            }
        }
        return max(maxVal,count);
    }
};