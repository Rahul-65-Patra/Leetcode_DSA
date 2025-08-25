class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
           
        int m = mat.size();  // row size
        int n = mat[0].size();  // column size

        vector<int>ans;

        map<int,vector<int>>mp;

       // fill the map using [i+j]
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mp[i+j].push_back(mat[i][j]);
            }
        }
        bool flip = true;
        for(auto &it : mp){
           if(flip){
            // it.second ko reverse kor do
            reverse(it.second.begin(),it.second.end());
           }

          for(int &num : it.second){
            ans.push_back(num);
          }
          flip = !flip;
        }
        return ans;
    }
};