// Problem: 226. Invert Binary Tree (LeetCode - Easy)
// Link: https://leetcode.com/problems/invert-binary-tree/
// Approach: Recursive DFS (Post-order / Pre-order Swap)
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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        // Swap the left and right children recursively
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        return root;
    }
}

