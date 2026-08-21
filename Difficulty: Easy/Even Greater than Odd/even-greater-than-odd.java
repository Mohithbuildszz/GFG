

class Solution {
    public ArrayList<Integer> rearrangeArray(ArrayList<Integer> arr) {
    int n = arr.size();
    for(int i=0;i<n-1;i++){
        if(i % 2 == 0){
            if(arr.get(i) > arr.get(i+1)){
                swap(arr, i, i+1);
            }
        } else {
            if(arr.get(i) < arr.get(i+1)){
                swap(arr, i, i+1);
            }
        }
    }
     return arr;   
}
private void swap(ArrayList<Integer> arr,int i, int j){
    int temp = arr.get(i);
    arr.set(i, arr.get(j));
    arr.set(j, temp);
}
        }
