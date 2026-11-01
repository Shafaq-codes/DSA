// Problem: Subsets with MEX in Range (GeeksforGeeks POTD - Oct 30)
// Link: https://www.geeksforgeeks.org/problems/crazy-subsets--131708/1
// Approach: Combinatorics + Frequency Count + Prefix Product
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int cntSubsets(int[] arr, int l, int r) {
        int n = arr.length;
        long MOD = 1000000007L;

        // MEX cannot exceed n because there are only n elements
        int limit = Math.min(r, n);

        int[] cnt = new int[limit + 2];
        for (int x : arr) {
            if (x >= 0 && x <= limit) {
                cnt[x]++;
            }
        }

        // Precompute powers of 2 modulo 10^9 + 7
        long[] pow2 = new long[n + 1];
        pow2[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow2[i] = (pow2[i - 1] * 2) % MOD;
        }

        long ans = 0;
        long prod = 1; // ways to pick at least one of each element in [0, i - 1]
        int sumCnt = 0; // total count of elements <= i

        for (int i = 0; i <= limit; i++) {
            sumCnt += cnt[i];

            // If i is within [l, r], add subsets with MEX = i
            if (i >= l) {
                int rem = n - sumCnt; // elements strictly greater than i or out of range
                long ways = (prod * pow2[rem]) % MOD;
                ans = (ans + ways) % MOD;
            }

            // Update prod for MEX = i + 1:
            // Element i must be included at least once: (2^cnt[i] - 1)
            long waysI = (pow2[cnt[i]] - 1 + MOD) % MOD;
            prod = (prod * waysI) % MOD;

            // If any element is completely missing from the array, no subset can have MEX > i
            if (prod == 0) {
                break;
            }
        }

        return (int) ans;
    }
}

