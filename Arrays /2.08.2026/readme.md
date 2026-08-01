# Any Duplicate Within K Distance

## Problem Statement

Given an unsorted array `arr[]` and an integer `k`, determine whether there exists any duplicate element such that the distance between its two occurrences is less than or equal to `k`.

---

## Example 1

**Input**

```text
arr = [1, 5, 4, 5, 1]
k = 3
```

**Output**

```text
true
```

**Explanation**

The duplicate element `5` appears at indices `1` and `3`.

Distance = `3 - 1 = 2`

Since `2 <= 3`, the answer is **true**.

---

## Example 2

**Input**

```text
arr = [10, 2, 3, 4, 10, 5]
k = 3
```

**Output**

```text
false
```

**Explanation**

The duplicate element `10` appears at indices `0` and `4`.

Distance = `4 - 0 = 4`

Since `4 > 3`, the answer is **false**.

---

# Approach

Instead of comparing every pair of elements, maintain a **HashSet** containing only the last `k` elements (a sliding window).

For each element:

- If it already exists in the HashSet, a duplicate within distance `k` is found.
- Otherwise, insert it into the HashSet.
- If the window size exceeds `k`, remove the element that is now outside the window.

This ensures that the HashSet always contains only the elements that are within `k` distance of the current index.

---

# Algorithm

1. Create an empty `HashSet`.
2. Traverse the array from left to right.
3. For every element:
   - If it already exists in the HashSet, return `true`.
   - Otherwise, add it to the HashSet.
4. If the HashSet size becomes greater than `k`, remove `arr[i-k]`.
5. If the traversal completes without finding any duplicate, return `false`.

---

# Dry Run

### Input

```text
arr = [1, 5, 4, 5, 1]
k = 3
```

| Index | Current | HashSet | Action |
|------:|---------|---------|--------|
| 0 | 1 | {} | Add 1 |
| 1 | 5 | {1} | Add 5 |
| 2 | 4 | {1,5} | Add 4 |
| 3 | 5 | {1,5,4} | Duplicate found → Return true |

---

# Java Solution

```java
import java.util.HashSet;

class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {

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
}
```

---

# Manual Input Version

```java
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

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(checkDuplicatesWithinK(arr, k));

        sc.close();
    }
}
```

---

# Complexity Analysis

| Complexity | Value |
|------------|-------|
| Time Complexity | **O(n)** |
| Space Complexity | **O(k)** |

---

# Why `set.remove(arr[i-k])`?

The HashSet should contain only the previous `k` elements.

For example,

```text
k = 3

Indices
0 1 2 3 4
```

When processing index `4`, only indices `1`, `2`, and `3` are within distance `3`.

Index `0` is now too far away because:

```text
4 - 0 = 4 > 3
```

Therefore, remove:

```java
set.remove(arr[i-k]);
```

This keeps the sliding window size equal to `k`.

---

# Pattern Used

- Hashing
- HashSet
- Sliding Window
- Fixed Size Window

---

# Key Takeaway

Maintain a **HashSet** of the last `k` elements while traversing the array.

- Duplicate found inside the window → **return true**
- Otherwise continue updating the window.
- If no duplicate is found by the end of traversal → **return false**.

---
