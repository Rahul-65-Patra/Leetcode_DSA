class Solution {
    public String reverseArray(char[] ch){
        int i=0;
        int j = ch.length-1;
        while(i<j){
            char c = ch[i];
            ch[i]=ch[j];
            ch[j]=c;
            i++;
            j--;
        }
        return new String(ch);
    }
    public String finalString(String s) {
        
        int n = s.length();
        String str = "";

        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c=='i'){
            str = reverseArray(str.toCharArray());
            }
            else{
            str+=c;
            }
        }
        return str;
    }
}