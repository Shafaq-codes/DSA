// Problem: XOR of Number Range (GeeksforGeeks POTD - Nov 18)
// Link: https://www.geeksforgeeks.org/problems/find-xor-of-numbers-from-l-to-r/1
// Approach: Periodicity of XOR from 1 to N (O(1) Math Trick)
// Time Complexity: O(1)
// Space Complexity: O(1)

#include <algorithm>

using namespace std;

class Solution {
  public:
    int findXOR(int l, int r) {
        return xorFrom1(r) ^ xorFrom1(max(0, l - 1));
    }

  private:
    int xorFrom1(int n) {
        if (n <= 0) return 0;
        int rem = n % 4;
        if (rem == 0) return n;
        if (rem == 1) return 1;
        if (rem == 2) return n + 1;
        return 0;
    }
};
