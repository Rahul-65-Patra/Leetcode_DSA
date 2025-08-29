class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        
        Map<String,Integer>freq = new HashMap<>();


        for(String w : s1.split(" ")){   // count words in s1
            freq.put(w,freq.getOrDefault(w,0)+1);
        }
        for(String w : s2.split(" ")){    // count words in s2
            freq.put(w,freq.getOrDefault(w,0)+1);
        }

        List<String>ans = new ArrayList<>();
        for(String word : freq.keySet()){
            if(freq.get(word)==1){
                ans.add(word);
            }
        }
        return ans.toArray(new String[0]);   // converts list into an array
    }
}