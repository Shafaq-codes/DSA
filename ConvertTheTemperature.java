// 2469. Convert the Temperature
// LeetCode URL: https://leetcode.com/problems/convert-the-temperature/
// Difficulty: Easy
// Language: Java

class ConvertTheTemperature {
    // 0 ms -> Beats 100.00% Runtime
    public double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }
}
