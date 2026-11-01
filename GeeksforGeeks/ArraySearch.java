// Array Search (Linear Search)
// GFG URL: https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1
// Difficulty: Basic
// Language: Java

class ArraySearch {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int search(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
