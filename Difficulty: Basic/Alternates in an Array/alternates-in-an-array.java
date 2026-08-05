class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> abc = new ArrayList<>();
        for(int i =0;i<arr.length;i+=2){
            abc.add(arr[i]);
        }
        return abc;
    }
}