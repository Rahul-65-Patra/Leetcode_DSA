class Solution {
    public String reverseOnlyLetters(String s) {
        
        // time complexity--> O(n)
        
        char[] ch = s.toCharArray();  // space complexity--> O(n)
        int i=0;
        int j=s.length()-1;

        while(i<j){
            while(i<j && !Character.isLetter(ch[i])){
                i++;
            }
            while(i<j && !Character.isLetter(ch[j])){
                j--;
            }
            if(i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
          }
        }
        return new String(ch);
    }
}