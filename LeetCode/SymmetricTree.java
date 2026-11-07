// Problem: 101. Symmetric Tree (LeetCode - Easy)
// Link: https://leetcode.com/problems/symmetric-tree/
// Approach: Recursive Mirror Comparison (DFS)
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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode t1, TreeNode t2) {
        // Both null -> symmetric
        if (t1 == null && t2 == null) {
            return true;
        }
        // One null and other not null -> not symmetric
        if (t1 == null || t2 == null) {
            return false;
        }

        // Values must match, and opposite children must be mirror images
        return (t1.val == t2.val)
            && isMirror(t1.left, t2.right)
            && isMirror(t1.right, t2.left);
    }
}

