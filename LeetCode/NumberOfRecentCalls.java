// 933. Number of Recent Calls
// LeetCode URL: https://leetcode.com/problems/number-of-recent-calls/
// Study Plan: LeetCode 75
// Language: Java

import java.util.LinkedList;
import java.util.Queue;

class NumberOfRecentCalls {
    Queue<Integer> queue;

    public NumberOfRecentCalls() {
        queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}
