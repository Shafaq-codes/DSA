// Problem: 88. Merge Sorted Array (LeetCode - Easy)
// Link: https://leetcode.com/problems/merge-sorted-array/
// Approach: Three Pointers (Fill from the back)
// Time Complexity: O(m + n)
// Space Complexity: O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        // Compare from the end of both arrays and place the larger element at the back
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // If elements still remain in nums2, copy them
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}

