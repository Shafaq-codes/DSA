// Largest with Same Parity Adjacent Swaps
// GFG POTD (20 October)
// URL: https://www.geeksforgeeks.org/problems/even-swap/1
// Difficulty: Medium
// Language: Java

import java.util.ArrayList;
import java.util.Arrays;

class LargestWithSameParityAdjacentSwaps {
    // Time Complexity: O(n log n)
    // Space Complexity: O(1) auxiliary
    public ArrayList<Integer> lexicographicallyLargest(int[] arr) {
        int n = arr.length;
        int i = 0;
        
        while (i < n) {
            int j = i;
            // Identify contiguous segment of same parity elements
            while (j < n && Math.abs(arr[j] % 2) == Math.abs(arr[i] % 2)) {
                j++;
            }
            
            // Sort segment ascending, then reverse to descending (lexicographically largest)
            Arrays.sort(arr, i, j);
            
            int left = i, right = j - 1;
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            
            i = j;
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            result.add(num);
        }
        
        return result;
    }
}
