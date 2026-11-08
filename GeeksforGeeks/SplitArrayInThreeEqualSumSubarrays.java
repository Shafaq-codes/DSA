// Problem: Split Array in Three Equal Sum Subarrays (GeeksforGeeks POTD - Nov 7)
// Link: https://www.geeksforgeeks.org/problems/split-array-in-three-equal-sum-subarrays/1
// Approach: Prefix Sum / Target Partition
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;

class Solution {
    public List<Integer> findSplit(int[] arr) {
        int totalSum = 0;
        int n = arr.length;

        for (int num : arr) {
            totalSum += num;
        }

        // Total sum must be divisible by 3
        if (totalSum % 3 != 0) {
            return Arrays.asList(-1, -1);
        }

        int target = totalSum / 3;
        int currentSum = 0;
        int i = -1, j = -1;

        // Traverse to find first split i and second split j (j < n - 1 to leave elements for 3rd subarray)
        for (int k = 0; k < n - 1; k++) {
            currentSum += arr[k];

            if (currentSum == target && i == -1) {
                i = k;
            } else if (currentSum == 2 * target && i != -1) {
                j = k;
                break;
            }
        }

        if (i != -1 && j != -1) {
            return Arrays.asList(i, j);
        }

        return Arrays.asList(-1, -1);
    }
}

