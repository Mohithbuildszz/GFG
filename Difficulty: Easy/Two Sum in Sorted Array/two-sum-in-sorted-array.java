class Solution {
    public ArrayList<Integer> twoSum(int[] arr, int target) {
   ArrayList<Integer> abc = new ArrayList<>();
   int n = arr.length;
        int left = 0;
        int right = n - 1;
        while(left<right){
            int sum= arr[left] + arr[right];
            if(sum == target ){
              abc.add(left + 1);
                abc.add(right + 1);
                 return abc;
            } else if(sum < target){
                left++;
            } else {
                right--;
            }
        }
        abc.add(-1);
        abc.add(-1);
       return abc;
        }
    }
