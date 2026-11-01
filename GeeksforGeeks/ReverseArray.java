// Reverse an Array
// GFG URL: https://www.geeksforgeeks.org/problems/reverse-an-array/1
// Language: Java

class ReverseArray {
    public void reverseArray(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
