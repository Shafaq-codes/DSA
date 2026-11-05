// Problem: Minimum Days (GeeksforGeeks POTD - Nov 5)
// Link: https://www.geeksforgeeks.org/problems/minimum-days--170646/1
// Approach: Simulation with Conflict Counting
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int getMinimumDays(String s, int[] p) {
        int n = s.length();
        char[] arr = s.toCharArray();

        // Step 1: Count initial adjacent equal character conflicts
        int conflicts = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                conflicts++;
            }
        }

        // If no two adjacent characters are equal, 0 days needed
        if (conflicts == 0) {
            return 0;
        }

        // Step 2: Replace characters day by day using permutation p
        for (int day = 0; day < n; day++) {
            int idx = p[day];

            // Check if replacing arr[idx] resolves conflict with left neighbor
            if (idx > 0 && arr[idx] == arr[idx - 1]) {
                conflicts--;
            }

            // Check if replacing arr[idx] resolves conflict with right neighbor
            if (idx < n - 1 && arr[idx] == arr[idx + 1]) {
                conflicts--;
            }

            // Mark character as '?'
            arr[idx] = '?';

            // Once all conflicts are resolved, return the number of days
            if (conflicts == 0) {
                return day + 1;
            }
        }

        return n;
    }
}

