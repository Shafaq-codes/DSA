// 1431. Kids With the Greatest Number of Candies
// LeetCode URL: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
// Study Plan: LeetCode 75 (Problem 2)
// Language: Java

import java.util.ArrayList;
import java.util.List;

class KidsWithCandies {
    // Time Complexity: O(n)  --> 1 ms (Beats 95.17%)
    // Space Complexity: O(n) --> Memory Beats 98.68%
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int c : candies) {
            if (c > max) max = c;
        }
        
        List<Boolean> result = new ArrayList<>();
        for (int c : candies) {
            result.add(c + extraCandies >= max);
        }
        
        return result;
    }
}
