class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int max = 0;
        while(left < right){
           
            int water = (right - left) * Math.min(arr[left],arr[right]);
            max = Math.max(max,water);
            if(arr[left] < arr[right]){
                left += 1;
            } else {
        right -= 1;
            }
        }
        return max;
    }
}