class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> abcd = new ArrayList<>();
        int n = arr.length;
        int Max = arr[n-1];
        abcd.add(Max);
        for(int i = n-2;i>=0;i--){
            if(arr[i] >= Max){
                abcd.add(arr[i]);
                Max=arr[i];
            }
        }
    Collections.reverse(abcd);
    return abcd;
    }
}
