class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        List<List<Integer>> li = new ArrayList<>();
        Arrays.sort(arr);

        int n = arr.length;
        int minV = Integer.MAX_VALUE;

        for(int i=0;i<n-1;i++){
           minV = Math.min(minV,arr[i+1] - arr[i]);    // find diff
        }

        for(int i=0;i<n-1;i++){
            if(minV == arr[i+1]-arr[i]){
                li.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return li;
    }
}