class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int dept = 0;

        for(char c : s.toCharArray()){
            if(c=='('){
                if(dept>0){
                ans.append('(');
                }
                dept++;
            }
            else{
                dept--;
                if(dept>0){
                    ans.append(')');
                }
            }
        }
        return ans.toString();
    }
}