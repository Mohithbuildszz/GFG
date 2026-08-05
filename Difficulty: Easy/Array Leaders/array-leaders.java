class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
    ArrayList<Integer> map = new ArrayList<>();
        int n = arr.length;
         int max = arr[n -1];
             map.add(max);
for(int i=n-2; i >= 0;i--){
    if(arr[i] >= max){
        map.add(arr[i]);
        max = arr[i];
        
    } 
}
Collections.reverse(map);
return map;
    }
    
}
