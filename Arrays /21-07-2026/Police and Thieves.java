
class Solution {
    public int catchThieves(char[] arr, int k) {
        // code here
    ArrayList<Integer> arr1 = new ArrayList<>();
    ArrayList<Integer> arr2 = new ArrayList<>();
  
  
    for(int i=0;i<arr.length;i++){
       if(arr[i] == 'P'){
        arr1.add(i);
       }
       else{
         arr2.add(i);
       }
       
    }
    
    
    int i = 0;
    int j = 0;
    int count=0;
    
    while (i < arr1.size()&&j<arr2.size()){
        if(Math.abs(arr1.get(i)-arr2.get(j))<=k){
            i++;
            j++;
            count++;
        } 
        
        else if(arr1.get(i)<arr2.get(j)){
            i++;
        }

        else j++;
        
    }
    return count;
    }
}
