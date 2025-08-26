class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonal = 0;  //9.487
        int maxArea = 0;  // 27

        for(int[] dia : dimensions){  // now dia = [9,3]
            int len = dia[0];  // 9
            int width = dia[1];  // 3
            double diagonal = Math.sqrt(len*len+width*width);  // sqrt(90) = 9.487
            int area = len * width;  // 27

            if(diagonal >maxDiagonal){
                maxDiagonal = diagonal;
                maxArea = area;
            }
            else if(diagonal == maxDiagonal){   // for Multiple rectangles
                maxArea = Math.max(maxArea,area);
            }
        }
        return maxArea;
    }
}