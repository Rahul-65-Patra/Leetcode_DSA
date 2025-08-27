class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = arr.clone();   // clone full array
        Arrays.sort(sorted);   // 10,20,30,40

        Map<Integer,Integer>m = new HashMap<>();
        int rank=1;
        for(int num : sorted){   // num= [10,20,30,40]
            if(!m.containsKey(num)){
                m.put(num,rank++);   // 10->1. 20->1, 30->1, 40->1
            }
        }

        int[] ans = new int[arr.length];

        for(int i=0;i<arr.length;i++){
           ans[i] = m.get(arr[i]);
        }
        return ans;
    }
}