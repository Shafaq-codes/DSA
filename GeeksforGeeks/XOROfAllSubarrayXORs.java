// Problem: XOR of All Subarray XORs (GeeksforGeeks POTD - Nov 4)
// Link: https://www.geeksforgeeks.org/problems/game-of-xor1541/1
// Approach: Contribution Technique / Bit Manipulation
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int subarrayXor(int[] arr) {
        int n = arr.length;

        // If n is even, every element appears an even number of times -> XOR is 0
        if (n % 2 == 0) {
            return 0;
        }

        // If n is odd, only elements at even indices (0, 2, 4, ...) appear an odd number of times
        int ans = 0;
        for (int i = 0; i < n; i += 2) {
            ans ^= arr[i];
        }

        return ans;
    }
}

