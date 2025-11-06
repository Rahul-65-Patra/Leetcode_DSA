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

       //-------------------- Using XOR Operator time Complexity--> O(n) and space complexity--> O(1) --------------------
        
        // int ans=nums.size();
        // for(int  i=0;i<nums.size();i++)
        //     ans =ans ^ i ^ nums[i];
        
        // return ans;



        //---------------------------- time Complexity--> O(n) and space complexity--> O(1) -----

          int n = nums.size();
           int expSum = n * (n+1)/2;
           int actSum = 0;

           for(int num : nums){
              actSum+=num;
           }
           int missing = expSum - actSum;
           return missing;
    }
};