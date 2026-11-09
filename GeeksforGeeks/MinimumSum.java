// Problem: Minimum Sum (GeeksforGeeks POTD - Nov 9)
// Link: https://www.geeksforgeeks.org/problems/minimum-sum4058/1
// Approach: Greedy Sorting + Digit String Addition
// Time Complexity: O(n log n)
// Space Complexity: O(n)

import java.util.*;

class Solution {
    String minSum(int[] arr) {
        Arrays.sort(arr);

        // Form two numbers alternately using sorted digits
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                num1.append(arr[i]);
            } else {
                num2.append(arr[i]);
            }
        }

        // Add both numbers from right to left
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int d1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int d2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = d1 + d2 + carry;
            result.append(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }

        result.reverse();

        // Remove leading zeros
        int start = 0;
        while (start < result.length() - 1 && result.charAt(start) == '0') {
            start++;
        }

        return result.substring(start);
    }
}
