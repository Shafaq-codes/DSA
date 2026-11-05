// Problem: 141. Linked List Cycle (LeetCode - Easy)
// Link: https://leetcode.com/problems/linked-list-cycle/
// Approach: Floyd's Cycle Finding Algorithm (Slow & Fast Pointers)
// Time Complexity: O(n)
// Space Complexity: O(1)

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Move slow by 1 step and fast by 2 steps
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If there is a cycle, slow and fast will meet
            if (slow == fast) {
                return true;
            }
        }

        // Fast reached the end, so no cycle
        return false;
    }
}
