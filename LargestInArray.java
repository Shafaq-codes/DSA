// Largest in Array
// GFG URL: https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1
// Difficulty: Basic
// Language: Java

class LargestInArray {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int largest(int[] arr) {
        int max = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        return max;
    }
}
