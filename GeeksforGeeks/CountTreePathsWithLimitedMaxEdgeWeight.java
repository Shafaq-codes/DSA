// Problem: Count Tree Paths With Limited Max Edge Weight (GeeksforGeeks POTD - Nov 3)
// Link: https://www.geeksforgeeks.org/problems/possible-paths--141628/1
// Approach: Offline Queries + Disjoint Set Union (DSU)
// Time Complexity: O(N log N + Q log Q)
// Space Complexity: O(N + Q)

import java.util.*;

class Solution {
    static class DSU {
        int[] parent;
        int[] size;

        DSU(int n) {
            parent = new int[n + 1];
            size = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        int find(int i) {
            if (parent[i] == i) return i;
            return parent[i] = find(parent[i]);
        }

        long union(int u, int v) {
            int rootU = find(u);
            int rootV = find(v);
            if (rootU != rootV) {
                if (size[rootU] < size[rootV]) {
                    int temp = rootU;
                    rootU = rootV;
                    rootV = temp;
                }
                parent[rootV] = rootU;
                long addedPaths = (long) size[rootU] * size[rootV];
                size[rootU] += size[rootV];
                return addedPaths;
            }
            return 0;
        }
    }

    public ArrayList<Integer> maximumWeight(int n, int[][] edges, int[] queries) {
        int q = queries.length;

        // Store queries with original indices: [limit, originalIndex]
        int[][] indexedQueries = new int[q][2];
        for (int i = 0; i < q; i++) {
            indexedQueries[i][0] = queries[i];
            indexedQueries[i][1] = i;
        }

        // Sort queries in ascending order of limit
        Arrays.sort(indexedQueries, (a, b) -> Integer.compare(a[0], b[0]));

        // Sort edges in ascending order of weight
        Arrays.sort(edges, (a, b) -> Integer.compare(a[2], b[2]));

        DSU dsu = new DSU(n);
        int[] ans = new int[q];
        long currentPaths = 0;
        int edgeIdx = 0;
        int totalEdges = edges.length;

        for (int i = 0; i < q; i++) {
            int limit = indexedQueries[i][0];
            int originalIdx = indexedQueries[i][1];

            // Add all edges whose weight is <= limit
            while (edgeIdx < totalEdges && edges[edgeIdx][2] <= limit) {
                int u = edges[edgeIdx][0];
                int v = edges[edgeIdx][1];
                currentPaths += dsu.union(u, v);
                edgeIdx++;
            }

            ans[originalIdx] = (int) currentPaths;
        }

        ArrayList<Integer> result = new ArrayList<>(q);
        for (int val : ans) {
            result.add(val);
        }

        return result;
    }
}

