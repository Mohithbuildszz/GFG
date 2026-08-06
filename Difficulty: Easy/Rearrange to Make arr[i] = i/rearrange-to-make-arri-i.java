class Solution {
    public static void modifyArray(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++){
            if (arr[i] == i)
        continue;
            for(int j=0;j<n;j++){
                if(arr[j] ==i){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    break;
                }
            }
        }
  for (int i = 0; i < n; i++) {
            if (arr[i] != i) {
                arr[i] = -1;
            }
        }
    }
}