class Solution {
    void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<=n-2;i++){
            int count = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[count]){
                    count = j;
                }
            }
            if(count != i){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
            }
        }
    }
}