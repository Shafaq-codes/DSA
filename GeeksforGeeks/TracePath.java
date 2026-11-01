// Trace Path
// GFG POTD (24 October)
// URL: https://www.geeksforgeeks.org/problems/trace-path3840/1
// Difficulty: Easy
// Language: Java

class TracePath {
    // Time Complexity: O(|s|) -> 0.17s (1120/1120 passed, 100% Accuracy)
    // Space Complexity: O(1)
    public boolean isPossible(int n, int m, String s) {
        int r = 0, c = 0;
        int minR = 0, maxR = 0;
        int minC = 0, maxC = 0;
        
        for (char ch : s.toCharArray()) {
            if (ch == 'L') c--;
            else if (ch == 'R') c++;
            else if (ch == 'U') r++;
            else if (ch == 'D') r--;
            
            minR = Math.min(minR, r);
            maxR = Math.max(maxR, r);
            minC = Math.min(minC, c);
            maxC = Math.max(maxC, c);
        }
        
        return (maxR - minR < n) && (maxC - minC < m);
    }
}
