// 1. Two Sum
// LeetCode URL: https://leetcode.com/problems/two-sum/
// Difficulty: Easy
// Topic: Array, Hash Table

#include <vector>
#include <unordered_map>
using namespace std;

// Approach 1: Brute Force (Nested Loops)
// Time Complexity: O(n^2)
// Space Complexity: O(1)
class SolutionBruteForce {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return {i, j};
                }
            }
        }
        return {};
    }
};

// Approach 2: Optimal using Hash Map (Single Pass)
// Time Complexity: O(n)
// Space Complexity: O(n)
class SolutionOptimal {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> seen; // number -> index
        for (int i = 0; i < nums.size(); i++) {
            int complement = target - nums[i];
            if (seen.find(complement) != seen.end()) {
                return {seen[complement], i};
            }
            seen[nums[i]] = i;
        }
        return {};
    }
};
