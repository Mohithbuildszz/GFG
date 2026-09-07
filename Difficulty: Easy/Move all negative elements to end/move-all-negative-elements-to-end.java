class Solution {
    public void segregateElements(int[] arr) {
       int n = arr.length;
       int[] temp = new int[n];
       int count = 0;
       for(int i = 0; i < n ; i++){
           if(arr[i] >= 0){
               temp[count++] = arr[i];
           }
       }
       for(int j = 0; j < n; j++){
           if(arr[j] < 0){
               temp[count++] = arr[j];
           }
       }
      for(int k = 0; k < n; k++){
          arr[k] = temp[k];
      }
    }
}