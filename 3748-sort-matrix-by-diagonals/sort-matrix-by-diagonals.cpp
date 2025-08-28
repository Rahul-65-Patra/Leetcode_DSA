class Solution {
public:
    vector<vector<int>> sortMatrix(vector<vector<int>>& grid) {
        
        vector<vector<int>>ans;
        int n = grid.size();
        int m = grid[0].size();
        
        unordered_map<int,vector<int>>mp;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               mp[i-j].push_back(grid[i][j]);
            }
        }

        for(auto& [key,vl] : mp){
            if(key>=0){
                sort(begin(vl),end(vl),greater<int>());
            }
            else{
                sort(begin(vl),end(vl));
            }
        }

        unordered_map<int,int>idx;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j] = mp[i-j][idx[i-j]++];
            }
        }
        return grid;
    }
};