// Problem: 206. Reverse Linked List (LeetCode - Easy)
// Link: https://leetcode.com/problems/reverse-linked-list/
// Approach: Iterative 3-Pointer (prev, curr, next)
// Time Complexity: O(n)
// Space Complexity: O(1)

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; // Save next node
            curr.next = prev;          // Reverse pointer
            prev = curr;               // Advance prev
            curr = next;               // Advance curr
        }

        return prev; // New head of the reversed list
    }
}

