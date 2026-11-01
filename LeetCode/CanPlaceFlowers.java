// 605. Can Place Flowers
// LeetCode URL: https://leetcode.com/problems/can-place-flowers/
// Study Plan: LeetCode 75 (Problem 3)
// Language: Java

class CanPlaceFlowers {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean emptyLeft = (i == 0 || flowerbed[i - 1] == 0);
                boolean emptyRight = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);
                
                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1;
                    n--;
                    if (n <= 0) return true;
                }
            }
        }
        return n <= 0;
    }
}
