// Problem: Subsets with MEX in Range (GeeksforGeeks POTD - Oct 30)
// Link: https://www.geeksforgeeks.org/problems/crazy-subsets--131708/1
// Approach: Combinatorics + Frequency Count + Prefix Product
// Time Complexity: O(n)
// Space Complexity: O(n)

#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
    int cntSubsets(vector<int> &arr, int l, int r) {
        int n = arr.size();
        long long MOD = 1000000007LL;

        int limit = min(r, n);

        vector<int> cnt(limit + 2, 0);
        for (int x : arr) {
            if (x >= 0 && x <= limit) {
                cnt[x]++;
            }
        }

        vector<long long> pow2(n + 1, 1);
        for (int i = 1; i <= n; i++) {
            pow2[i] = (pow2[i - 1] * 2) % MOD;
        }

        long long ans = 0;
        long long prod = 1;
        int sumCnt = 0;

        for (int i = 0; i <= limit; i++) {
            sumCnt += cnt[i];

            if (i >= l) {
                int rem = n - sumCnt;
                long long ways = (prod * pow2[rem]) % MOD;
                ans = (ans + ways) % MOD;
            }

            long long waysI = (pow2[cnt[i]] - 1 + MOD) % MOD;
            prod = (prod * waysI) % MOD;

            if (prod == 0) {
                break;
            }
        }

        return ans;
    }
};

