# Linear Search

## Problem Statement

Given an array of integers `nums` and an integer `target`, return the **smallest (0-based) index** where the target appears in the array. If the target is not found, return `-1`.

---

## Example 1

**Input**

```text
nums = [2, 3, 4, 5, 3]
target = 3
```

**Output**

```text
1
```

**Explanation**

The first occurrence of `3` is at index `1`.

---

## Example 2

**Input**

```text
nums = [2, -4, 4, 0, 10]
target = 6
```

**Output**

```text
-1
```

**Explanation**

The target value is not present in the array.

---

## Approach

Linear Search checks each element of the array one by one from left to right.

1. Start from index `0`.
2. Compare the current element with the target.
3. If they are equal, return the current index.
4. Continue until the end of the array.
5. If the target is not found, return `-1`.

---

## Algorithm

1. Traverse the array using a loop.
2. Compare each element with the target.
3. If a match is found, return the index.
4. If the loop finishes without finding the target, return `-1`.

---

## Java Solution

```java
class Solution {
    public int linearSearch(int nums[], int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
```

---

## Dry Run

### Input

```text
nums = [2, 3, 4, 5, 3]
target = 3
```

| Index | Element | Comparison | Result |
|------:|--------:|-----------|--------|
| 0 | 2 | 2 == 3 | No |
| 1 | 3 | 3 == 3 | Yes → Return 1 |

**Output**

```text
1
```

---

## Another Example

### Input

```text
nums = [1, 3, 5, -4, 1]
target = 1
```

### Traversal

```text
Index 0 → 1 == 1 ✓
Return 0
```

**Output**

```text
0
```

---

## Complexity Analysis

| Complexity | Value |
|------------|-------|
| Time Complexity | O(n) |
| Space Complexity | O(1) |

---

## Edge Cases

- Target is the first element.
- Target is the last element.
- Target appears multiple times.
- Target does not exist.
- Array contains only one element.
- Array contains negative numbers.
- Array contains duplicate values.

---

## Test Cases

### Test Case 1

```text
Input:
nums = [2,3,4,5,3]
target = 3

Output:
1
```

### Test Case 2

```text
Input:
nums = [2,-4,4,0,10]
target = 6

Output:
-1
```

### Test Case 3

```text
Input:
nums = [5]
target = 5

Output:
0
```

### Test Case 4

```text
Input:
nums = [5]
target = 1

Output:
-1
```

### Test Case 5

```text
Input:
nums = [10,20,30,40]
target = 40

Output:
3
```

### Test Case 6

```text
Input:
nums = [7,7,7,7]
target = 7

Output:
0
```

### Test Case 7

```text
Input:
nums = [-5,-4,-3,-2,-1]
target = -2

Output:
3
```

### Test Case 8

```text
Input:
nums = [1,3,5,-4,1]
target = 1

Output:
0
```

---

## Key Takeaways

- Linear Search is the simplest searching algorithm.
- It works on both sorted and unsorted arrays.
- It always returns the **first occurrence** of the target.
- No extra space is required.
- Best suited for small datasets or unsorted arrays.

---

## Tags

`Array` `Searching` `Linear Search` `Java` `DSA`
