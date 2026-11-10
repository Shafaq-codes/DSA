// Problem: 112. Path Sum (LeetCode - Easy)
// Link: https://leetcode.com/problems/path-sum/
// Approach: Recursive Root-to-Leaf DFS
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        // If leaf node reached, check if remaining sum matches node value
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        int remaining = targetSum - root.val;
        return hasPathSum(root.left, remaining) || hasPathSum(root.right, remaining);
    }
}

