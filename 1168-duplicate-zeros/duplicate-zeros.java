class Solution {
    public void duplicateZeros(int[] arr) {
         
       int[] copyArray = arr.clone();
       int len = arr.length;
       int index = 0;

       for(int i=0;i<len && index<len;i++){
        if(copyArray[i]==0){
            arr[index++] = copyArray[i];
            if(index<len){
                arr[index++]=0;
            }
        }
            else{
                arr[index++]=copyArray[i];
            }
       }
    }
}