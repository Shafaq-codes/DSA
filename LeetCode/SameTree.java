// Problem: 100. Same Tree (LeetCode - Easy)
// Link: https://leetcode.com/problems/same-tree/
// Approach: Recursive Structural & Value Comparison (DFS)
// Time Complexity: O(n)
// Space Complexity: O(h) where h is tree height

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Both trees are empty -> identical
        if (p == null && q == null) {
            return true;
        }

        // One tree is empty and other is not -> not identical
        if (p == null || q == null) {
            return false;
        }

        // Values must be equal and both left and right subtrees must be identical
        return (p.val == q.val)
            && isSameTree(p.left, q.left)
            && isSameTree(p.right, q.right);
    }
}

