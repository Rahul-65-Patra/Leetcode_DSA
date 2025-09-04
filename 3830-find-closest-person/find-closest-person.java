class Solution {
    public int findClosest(int x, int y, int z) {
        
        int pos1 = Math.abs(x-z);
        int pos2 = Math.abs(y-z);

        if(pos1<pos2){
            return 1;
        }
        else if(pos1>pos2){
            return 2;
        }
        else{
            return 0;
        }
    }
}