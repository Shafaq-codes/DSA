// Problem: Largest Sum Cycle (GeeksforGeeks POTD - Nov 2)
// Link: https://www.geeksforgeeks.org/problems/largest-sum-cycle--170645/1
// Approach: Iterative 3-State Cycle Detection (O(n) time, O(n) space)
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int largestSumCycle(int[] edge) {
        int n = edge.length;
        // visited array: 0 = unvisited, 1 = visiting (in current path), 2 = fully visited
        int[] visited = new int[n];
        long maxSum = -1;

        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                int curr = i;

                // Move forward until we hit an already visited node or dead end (-1)
                while (curr != -1 && visited[curr] == 0) {
                    visited[curr] = 1;
                    curr = edge[curr];
                }

                // If curr is in the current traversal path, a cycle is detected!
                if (curr != -1 && visited[curr] == 1) {
                    long cycleSum = curr;
                    int temp = edge[curr];

                    while (temp != curr) {
                        cycleSum += temp;
                        temp = edge[temp];
                    }

                    maxSum = Math.max(maxSum, cycleSum);
                }

                // Mark all nodes visited in this traversal path as fully visited (2)
                int temp = i;
                while (temp != -1 && visited[temp] == 1) {
                    visited[temp] = 2;
                    temp = edge[temp];
                }
            }
        }

        return (int) maxSum;
    }
}

