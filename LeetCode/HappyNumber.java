// Problem: 202. Happy Number (LeetCode - Easy)
// Link: https://leetcode.com/problems/happy-number/
// Approach: Floyd's Cycle-Finding Algorithm (Fast & Slow Pointer)
// Time Complexity: O(log n)
// Space Complexity: O(1) auxiliary space

class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);

        // Jab tak fast 1 na ban jaye ya cycle detect na ho jaye
        while (fast != 1 && slow != fast) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }

        return fast == 1;
    }

    private int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int digit = n % 10;
            totalSum += digit * digit;
            n /= 10;
        }
        return totalSum;
    }
}
