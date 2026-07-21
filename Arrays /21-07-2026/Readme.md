# Police and Thieves

## Problem Statement

Given an array `arr[]` containing either:

- `'P'` → Policeman
- `'T'` → Thief

A policeman can catch **at most one thief**, and only if the thief is within a distance of `k`.

Return the **maximum number of thieves** that can be caught.

---

## Approach

This solution uses a **Greedy + Two Pointers** approach.

### Step 1: Store Positions

Traverse the array once and store:

- Indices of all policemen in one list.
- Indices of all thieves in another list.

Example:

```
arr = ['P', 'T', 'T', 'P', 'T']

Police = [0, 3]
Thieves = [1, 2, 4]
```

---

### Step 2: Use Two Pointers

Maintain two pointers:

- `i` → Current policeman
- `j` → Current thief

Compare the positions of the current policeman and thief.

---

### Case 1: Policeman Can Catch the Thief

If

```
|Police[i] - Thief[j]| <= k
```

then:

- Count one successful catch.
- Move both pointers.

Reason:
- Policeman has already caught one thief.
- Thief has already been caught.

---

### Case 2: Policeman is Too Far Left

If

```
Police[i] < Thief[j]
```

and they cannot be matched,

move the policeman pointer.

Reason:
This policeman cannot catch the current thief or any future thief since future thieves are even farther away.

---

### Case 3: Thief is Too Far Left

Otherwise,

move the thief pointer.

Reason:
This thief cannot be caught by the current policeman or any future policeman because future policemen are even farther to the right.

---

## Dry Run

### Input

```
arr = ['P', 'T', 'T', 'P', 'T']
k = 1
```

### Stored Positions

```
Police  = [0, 3]
Thieves = [1, 2, 4]
```

### Iteration 1

```
Police = 0
Thief  = 1

Distance = 1 <= k
```

Catch the thief.

```
count = 1

i = 1
j = 1
```

---

### Iteration 2

```
Police = 3
Thief  = 2

Distance = 1 <= k
```

Catch the thief.

```
count = 2

i = 2
j = 2
```

Loop ends because all policemen have been processed.

Final Answer:

```
2
```

---

## Why Greedy Works

The algorithm always matches the **leftmost available policeman** with the **leftmost available thief** whenever possible.

If they can be matched, delaying the match cannot produce a better result because each policeman and thief can only participate in one match.

If they cannot be matched, the one with the smaller position can never form a valid match later, so it is safely skipped.

This guarantees the maximum number of thieves caught.

---

## Complexity Analysis

| Complexity | Value |
|------------|-------|
| Time Complexity | **O(n)** |
| Space Complexity | **O(n)** |

---

## Key Concepts

- Greedy Algorithm
- Two Pointers
- Array Traversal
- Simulation

---

## Java Solution

```java
class Solution {
    public int catchThieves(char[] arr, int k) {

        ArrayList<Integer> police = new ArrayList<>();
        ArrayList<Integer> thieves = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'P')
                police.add(i);
            else
                thieves.add(i);
        }

        int i = 0, j = 0, count = 0;

        while (i < police.size() && j < thieves.size()) {

            if (Math.abs(police.get(i) - thieves.get(j)) <= k) {
                count++;
                i++;
                j++;
            } else if (police.get(i) < thieves.get(j)) {
                i++;
            } else {
                j++;
            }
        }

        return count;
    }
}
```

---

## Takeaways

- Store the positions of policemen and thieves separately.
- Use two pointers to find the optimal matching.
- Match whenever possible.
- Skip the policeman or thief that can no longer form a valid match.
- Greedy matching ensures the maximum number of thieves are caught in linear time.
