// Problem: 104. Maximum Depth of Binary Tree (LeetCode - Easy)
// Link: https://leetcode.com/problems/maximum-depth-of-binary-tree/
// Approach: Recursive DFS (Post-order Traversal)
// Time Complexity: O(n)
// Space Complexity: O(h) where h is tree height (call stack)

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1 + Math.max(leftDepth, rightDepth);
    }
}
