// Count Pairs Violating BST Property
// GFG POTD (23 October)
// URL: https://www.geeksforgeeks.org/problems/count-pairs-violating-bst-property--212515/1
// Difficulty: Medium
// Language: Java

import java.util.ArrayList;

class CountPairsViolatingBSTProperty {
    // Binary Tree Node
    static class Node {
        int data;
        Node left, right;
        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    public int pairsViolatingBST(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        
        int n = arr.size();
        int[] a = new int[n];
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = arr.get(i);
        }
        
        return (int) mergeSortAndCount(a, temp, 0, n - 1);
    }
    
    private void inorder(Node root, ArrayList<Integer> arr) {
        if (root == null) return;
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }
    
    private long mergeSortAndCount(int[] arr, int[] temp, int left, int right) {
        long invCount = 0;
        if (left < right) {
            int mid = left + (right - left) / 2;
            
            invCount += mergeSortAndCount(arr, temp, left, mid);
            invCount += mergeSortAndCount(arr, temp, mid + 1, right);
            invCount += merge(arr, temp, left, mid, right);
        }
        return invCount;
    }
    
    private long merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;
        long invCount = 0;
        
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i + 1);
            }
        }
        
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
        
        return invCount;
    }
}
