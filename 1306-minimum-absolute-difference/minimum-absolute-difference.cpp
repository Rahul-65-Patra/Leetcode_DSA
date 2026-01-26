class Solution {
public:
    vector<vector<int>> minimumAbsDifference(vector<int>& arr) {
          
          vector<vector<int>>v;
          sort(arr.begin(),arr.end());
          int n = arr.size();
           int minDiff = INT_MAX;

          for(int i=0;i<n-1;i++){    // find min Difference
             minDiff = min(minDiff,arr[i+1]-arr[i]);
          }

          for(int i=0;i<n-1;i++){    // Store pairs with minimum difference
             if(minDiff == arr[i+1]-arr[i]){
                v.push_back({arr[i],arr[i+1]});
             }
          }
          return v;
    }
};