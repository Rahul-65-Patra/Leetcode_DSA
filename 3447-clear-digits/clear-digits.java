class Solution {
    public String clearDigits(String s) {
        
        StringBuilder st = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                st.append(c);  // only add letter
            }
            else{
                 if(st.length()>0){  // // it's a digit → remove last letter
                    st.deleteCharAt(st.length()-1);
                 }
            }
        }
        return st.toString();
    }
}