class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int n = arr.length;
        int total = arr[0];
        int maxend = arr[0];
        int maxsoo = arr[0];
        int minend = arr[0];
        int minsoo = arr[0];
        for(int i = 1;i<n;i++){
            total += arr[i];
            
            maxend = Math.max(arr[i],maxend+arr[i]);
            maxsoo = Math.max(maxsoo,maxend);
            
            minend = Math.min(arr[i],minend+arr[i]);
            minsoo = Math.min(minsoo,minend);
        }
        if(maxsoo < 0){
            return maxsoo;
        }
        int result = total - minsoo;
        return Math.max(maxsoo,result);
    }
}
