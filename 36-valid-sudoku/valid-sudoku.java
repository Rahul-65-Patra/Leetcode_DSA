class Solution {
    public boolean isValidSudoku(char[][] board) {
            Set<String> seen = new HashSet<>();
          int n = board.length;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                char num = board[row][col];

                if (num != '.') {
                    String rowKey = "row" + row + num;
                    String colKey = "col" + col + num;
                    String boxKey = "box" + (row / 3) + (col / 3) + num;

                    if (seen.contains(rowKey) || seen.contains(colKey) || seen.contains(boxKey))
                        return false;

                    seen.add(rowKey);
                    seen.add(colKey);
                    seen.add(boxKey);
                }
            }
        }
        return true;
    }
}