// 2114. Maximum Number of Words Found in Sentences
// LeetCode URL: https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
// Language: Java

class MaximumNumberOfWordsFoundInSentences {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (String s : sentences) {
            int wordCount = s.split(" ").length;
            if (wordCount > maxWords) {
                maxWords = wordCount;
            }
        }
        return maxWords;
    }
}
