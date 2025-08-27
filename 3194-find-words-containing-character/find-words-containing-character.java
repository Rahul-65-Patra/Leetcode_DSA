class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        
        List<Integer>ans = new ArrayList<>();

        for(int i=0;i<words.length;i++){
            
            if(words[i].indexOf(x)!=-1){   // "leet".indexOf('e')--> 1 (means 'e' found at postion 1)
                ans.add(i);     
            }
        }
        return ans;
    }
}