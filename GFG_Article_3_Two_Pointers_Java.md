# Two Pointers Technique in Java: A Beginner's Guide with Examples

The **Two Pointers Technique** is one of the most fundamental and versatile algorithmic patterns used to solve array and string problems in Data Structures and Algorithms (DSA). It is frequently tested in technical interviews at top tech companies like Amazon, Microsoft, and TCS.

In this guide, we will understand how the Two Pointers approach works, its primary variations, and see practical Java implementations.

---

## What is the Two Pointers Technique?

Instead of using nested loops that run in $\mathcal{O}(n^2)$ time, the Two Pointers technique maintains two pointers (variables holding indices) that traverse an array or string either:
1. **In Opposite Directions** (One from the left, one from the right moving inward).
2. **In the Same Direction** (Slow and fast pointers).

By moving pointers intelligently based on problem constraints, we can typically reduce the time complexity from **$\mathcal{O}(n^2)$ down to $\mathcal{O}(n)$**.

---

## Pattern 1: Opposite Direction (Left & Right Pointers)

In this pattern:
- Pointer `left` starts at the beginning (`index = 0`).
- Pointer `right` starts at the end (`index = length - 1`).
- The pointers move towards each other until they meet.

### Classic Problem: Reversing an Array In-Place

Given an integer array, reverse its elements without using extra memory.

#### Java Implementation:
```java
public class ReverseArray {
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            // Swap elements at left and right
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            // Move pointers inward
            left++;
            right--;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        reverse(nums);
        // nums is now: {5, 4, 3, 2, 1}
    }
}
```

* **Time Complexity:** $\mathcal{O}(n)$ — each element is inspected once.
* **Space Complexity:** $\mathcal{O}(1)$ — in-place modification.

---

### Classic Problem: Valid Palindrome

Given a string, determine whether it reads the same backward as forward.

#### Java Implementation:
```java
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // Mismatch found
            }
            left++;
            right--;
        }
        
        return true;
    }
}
```

---

## Pattern 2: Same Direction (Slow & Fast Pointers)

In this pattern:
- Both pointers start at the beginning.
- A **fast pointer** scans ahead to find elements of interest.
- A **slow pointer** writes or updates elements in-place.

### Classic Problem: Move Zeroes to End

Given an array `nums`, move all zeroes to the end while maintaining the relative order of non-zero elements.

#### Java Implementation:
```java
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int slow = 0; // Tracks position to place the next non-zero element
        
        // Fast pointer scans the whole array
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                nums[slow++] = nums[fast];
            }
        }
        
        // Fill remaining slots with 0
        while (slow < nums.length) {
            nums[slow++] = 0;
        }
    }
}
```

* **Time Complexity:** $\mathcal{O}(n)$
* **Space Complexity:** $\mathcal{O}(1)$

---

## When to Use the Two Pointers Technique?

Look for these clues in problem statements:
1. The array is **sorted** (e.g., finding a pair with a target sum).
2. The problem asks to **reverse**, **partition**, or **swap** elements in-place.
3. The problem involves checking for symmetry (e.g., **palindromes**).
4. You need to filter elements or compact an array without allocating new memory.

---

## Summary

| Variation | Pointer Movement | Common Use Cases |
|---|---|---|
| **Opposite Direction** | `left ->` and `<- right` | Array reversal, Palindrome check, Two Sum on sorted array |
| **Same Direction** | `slow ->` and `fast ->` | Move Zeroes, Remove Duplicates, Cycle detection |

---

## Conclusion
The Two Pointers technique is an essential building block in DSA that allows you to write optimal $\mathcal{O}(n)$ solutions with $\mathcal{O}(1)$ space. Practicing these foundational problems will help you easily recognize this pattern in technical interviews.
