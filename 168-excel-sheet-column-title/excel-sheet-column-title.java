class Solution {
    public String convertToTitle(int columnNumber) {

        StringBuilder column = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            column.insert(0,(char)(columnNumber%26+'A'));
            columnNumber=columnNumber/26;
        }
        return column.toString();
    }
}