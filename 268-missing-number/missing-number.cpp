class Solution {
public:
    int missingNumber(vector<int>& nums) {
        // int sum=0;
        // int sum1=0;
        // for(int i=0;i<=nums.size();i++){
        //     sum+=i;
        // }
        // for(int i=0;i<nums.size();i++){
        //     sum1+=nums[i];
        // }
        // return sum-sum1;

       //-------------------- Using XOR Operator --------------------
        
        // int ans=nums.size();
        // for(int  i=0;i<nums.size();i++)
        //     ans =ans ^ i ^ nums[i];
        
        // return ans;



        //----------------------------


        int ans=nums.size();
        for(int i=0;i<nums.size();i++){
            ans = ans^i^nums[i];
        }
        return ans;
    }
};