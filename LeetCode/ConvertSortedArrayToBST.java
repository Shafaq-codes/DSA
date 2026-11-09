// Problem: 108. Convert Sorted Array to Binary Search Tree (LeetCode - Easy)
// Link: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
// Approach: Divide and Conquer / Binary Search Tree (Mid as Root)
// Time Complexity: O(n)
// Space Complexity: O(log n) call stack

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
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }

    private TreeNode buildBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        // Mid element becomes the root to ensure height balance
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        // Recursively build left and right subtrees
        root.left = buildBST(nums, left, mid - 1);
        root.right = buildBST(nums, mid + 1, right);

        return root;
    }
}

