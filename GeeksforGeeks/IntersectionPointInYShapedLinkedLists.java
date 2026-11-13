// Problem: Intersection Point in Y Shaped Linked Lists (GeeksforGeeks POTD - Nov 13)
// Link: https://www.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1
// Approach: Two Pointers Cycle Redirection
// Time Complexity: O(n + m)
// Space Complexity: O(1)

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class Intersect {
    int intersectPoint(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            return -1;
        }

        Node ptr1 = head1;
        Node ptr2 = head2;

        // Traverse until they collide at intersection or both reach null
        while (ptr1 != ptr2) {
            ptr1 = (ptr1 == null) ? head2 : ptr1.next;
            ptr2 = (ptr2 == null) ? head1 : ptr2.next;
        }

        return (ptr1 != null) ? ptr1.data : -1;
    }
}
