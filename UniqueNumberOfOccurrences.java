// 1207. Unique Number of Occurrences
// LeetCode URL: https://leetcode.com/problems/unique-number-of-occurrences/
// Study Plan: LeetCode 75
// Language: Java

import java.util.*;

class UniqueNumberOfOccurrences {
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : arr) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        
        Set<Integer> set = new HashSet<>(count.values());
        return count.size() == set.size();
    }
}
