class Solution {
    public int catchThieves(char[] arr, int k) {
        
    ArrayList<Integer> arr1 = new ArrayList<>();
    ArrayList<Integer> arr2 = new ArrayList<>();
  
 // Step 1: Store Positions
    for(int i=0;i<arr.length;i++){
       if(arr[i] == 'P'){
        arr1.add(i);
       }
       else{
         arr2.add(i);
       }
       
    }
    
    //Step 2: Initialize Two Pointers
    int i = 0;
    int j = 0;
    int count=0;
    //Step 3: Compare Policeman and Thief
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
