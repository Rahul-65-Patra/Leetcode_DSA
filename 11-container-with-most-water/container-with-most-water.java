class Solution {
    public int maxArea(int[] height) {
        // Optimized Solution ---->(Two Pointer Approach) T.C--> O(n)

       int n=height.length;
       int ans=0;
       int lb=0;
       int rb=n-1;
       while(lb<rb){
        int w=rb-lb;
        int h=Math.min(height[lb],height[rb]);
        int area=w*h;
        ans=Math.max(ans,area);
        if(height[lb]<height[rb]){
            lb++;
        }
        else{
            rb--;
        }
       }
      return ans;
    }
}