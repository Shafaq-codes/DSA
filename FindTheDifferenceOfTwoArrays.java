// 2215. Find the Difference of Two Arrays
// LeetCode URL: https://leetcode.com/problems/find-the-difference-of-two-arrays/
// Study Plan: LeetCode 75
// Language: Java

import java.util.*;

class FindTheDifferenceOfTwoArrays {
    // Time Complexity: O(n + m)
    // Space Complexity: O(n + m) -> Memory Beats 96.32%
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>(), s2 = new HashSet<>();
        for (int n : nums1) s1.add(n);
        for (int n : nums2) s2.add(n);
        
        List<Integer> list1 = new ArrayList<>(), list2 = new ArrayList<>();
        for (int n : s1) if (!s2.contains(n)) list1.add(n);
        for (int n : s2) if (!s1.contains(n)) list2.add(n);
        
        return Arrays.asList(list1, list2);
    }
}
