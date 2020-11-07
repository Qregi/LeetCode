package com.java.leetCode.code;

/**
 * @Author xia.qiu
 * @Date 2020/11/07
 */
public class MaxPlainDromeString {
    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        int leftIndex,rightIndex;
        int length = 1;
        int maxLen = 0;
        int maxStart = 0;
        int stringLength = s.length();
        for (int i = 0; i < stringLength; ++i) {
            leftIndex = i - 1;
            rightIndex = i + 1;
            while (leftIndex >= 0 && s.charAt(leftIndex) == (s.charAt(i))) {
                leftIndex--;
                length++;
            }
            while(rightIndex < stringLength && s.charAt(rightIndex) == (s.charAt(i))) {
                rightIndex++;
                length++;
            }
            // 左右同时相等时，left-- right++
            while (leftIndex >= 0
                    && rightIndex < stringLength
                    && s.charAt(leftIndex) == s.charAt(rightIndex)) {
                leftIndex--;
                rightIndex++;
                length += 2;
            }
            if (length > maxLen) {
                maxLen = length;
                maxStart = leftIndex;
            }
            length = 1;
        }
        return s.substring(maxStart + 1, maxStart + maxLen + 1);
    }

    public String longestPalindrome2(String s) {
        // 特判
        int len = s.length();
        if (len < 2) {
            return s;
        }

        int maxLen = 1;
        int begin = 0;

        // dp[i][j] 表示 s[i, j] 是否是回文串
        boolean[][] dp = new boolean[len][len];
        char[] charArray = s.toCharArray();

        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        for (int j = 1; j < len; j++) {
            for (int i = 0; i < j; i++) {
                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }

                // 只要 dp[i][j] == true 成立，就表示子串 s[i..j] 是回文，此时记录回文长度和起始位置
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        int[] resultIndex = new int[2];
        return s.substring(begin, begin + maxLen);
    }


    public String longestPalindrome3(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        int[] resultIndex = new int[2];
        for (int i = 0; i < s.length(); ++i) {
            i = getLongestString(s, resultIndex, i);
        }
        return s.substring(resultIndex[0], resultIndex[1]);
    }

    private int getLongestString(String s, int[] resultIndex, int currentIndex) {
        int rightIndex = currentIndex + 1;
        // 向右一直遍历，直到遍历完所有与当前字符相等的字符串
        while (rightIndex < s.length() && s.charAt(rightIndex) == s.charAt(currentIndex)) {
            rightIndex++;
        }

        // 记录与当前字符相等的最后一个字符的位置
        int newCurrentIndex = rightIndex - 1;
        // 从当前字符和rightIndex开始,向两边扩散,直到遇到不相等的字符
        while(currentIndex > 0 && rightIndex < s.length()) {
            if (s.charAt(currentIndex - 1) == s.charAt(rightIndex)) {
                currentIndex--;
                rightIndex++;
                continue;
            }
            break;
        }

        if (rightIndex - 1 - currentIndex > resultIndex[1] - resultIndex[0]) {
            resultIndex[0] = currentIndex;
            resultIndex[1] = rightIndex;
        }
        return newCurrentIndex;
    }

}
