class Solution {
    public void nextPermutation(int[] arr) {

        int n = arr.length;

        // Step 1: Find pivot
        int i = n - 2;

        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // Step 2: Find element greater than pivot
        if (i >= 0) {

            int j = n - 1;

            while (arr[j] <= arr[i]) {
                j--;
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Step 3: Reverse the remaining part
        int left = i + 1;
        int right = n - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}