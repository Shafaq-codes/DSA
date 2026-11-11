// Problem: Union of Two Sorted Arrays with Distinct Elements (GeeksforGeeks POTD - Nov 10)
// Link: https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-with-distinct-elements/1
// Approach: Two Pointers (Merge Step)
// Time Complexity: O(n + m)
// Space Complexity: O(1) auxiliary

import java.util.*;

class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int i = 0, j = 0;
        ArrayList<Integer> res = new ArrayList<>();

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                res.add(a[i]);
                i++;
            } else if (b[j] < a[i]) {
                res.add(b[j]);
                j++;
            } else {
                res.add(a[i]);
                i++;
                j++;
            }
        }

        while (i < n) {
            res.add(a[i]);
            i++;
        }

        while (j < m) {
            res.add(b[j]);
            j++;
        }

        return res;
    }
}

