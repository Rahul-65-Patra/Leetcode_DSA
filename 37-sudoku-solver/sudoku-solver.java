class Solution {
       boolean isSafe(int row,int col,char[][] board,char val){
        
        for(int i=0;i<board.length;i++){
            
            // row side
            if(board[row][i]==val){
                return false;
            }
            //col side
            if(board[i][col]==val){
                return false;
            }
            // 3*3 matrix
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==val){
                return false;
            }
        }
        return true;
    }
    boolean solve(char[][] board){
        int n = board.length;
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(board[row][col]=='.'){
                    for(char val='1';val<='9';val++){
                        if(isSafe(row,col,board,val)){
                            board[row][col]=val;
                            
                            // recurtion
                            boolean solProl = solve(board);
                            if(solProl){
                                return true;
                            }
                            else{
                                board[row][col]='.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
         solve(board);
    }
}