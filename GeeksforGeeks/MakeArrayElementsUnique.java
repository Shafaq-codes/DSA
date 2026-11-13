// Problem: Make Array Elements Unique (GeeksforGeeks POTD - Nov 11)
// Link: https://www.geeksforgeeks.org/problems/make-array-elements-unique--170645/1
// Approach: Greedy Sorting + Increment Tracking
// Time Complexity: O(n log n)
// Space Complexity: O(1) auxiliary

import java.util.*;

class Solution {
    public int minIncrements(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        Arrays.sort(arr);
        int increments = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                int needed = arr[i - 1] + 1;
                increments += (needed - arr[i]);
                arr[i] = needed;
            }
        }

        return increments;
    }
}

