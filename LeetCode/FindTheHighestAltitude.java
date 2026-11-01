// 1732. Find the Highest Altitude
// LeetCode URL: https://leetcode.com/problems/find-the-highest-altitude/
// Study Plan: LeetCode 75 (Problem 7)
// Language: Java

class FindTheHighestAltitude {
    // Prefix Sum
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int largestAltitude(int[] gain) {
        int current = 0;
        int max = 0;
        
        for (int g : gain) {
            current += g;
            if (current > max) {
                max = current;
            }
        }
        
        return max;
    }
}
