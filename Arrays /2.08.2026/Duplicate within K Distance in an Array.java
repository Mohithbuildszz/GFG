import java.util.*;

public class Main {

    public static boolean checkDuplicatesWithinK(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
        if (set.contains(arr[i])) {
        return true;
        }
            set.add(arr[i]);
            if (set.size() > k) {
            set.remove(arr[i - k]);
     }
        }
               return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Enter array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Enter k
        int k = sc.nextInt();
        // Print result
        System.out.println(checkDuplicatesWithinK(arr, k));
        sc.close();
    }
}
