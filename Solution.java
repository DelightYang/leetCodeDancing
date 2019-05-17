package leetcode.leetcode5;

// 最长回文子串
public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
//            分为奇偶序列两种情况 奇偶指字符串长度
            int len1 = expandFromCenter(s, i, i);
            int len2 = expandFromCenter(s, i, i + 1);
            int finalLength = Math.max(len1, len2);

            if (finalLength > end - start) {
                start = i - (finalLength - 1) / 2;
                end = i + finalLength / 2;
            }

        }
//        substring是现成方法
        return s.substring(start, end + 1);
    }

    private int expandFromCenter(String s, int left, int right) {
        int L = left, R = right;
//        这个while简直绝
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
//           继续向外扩展
            L--;
            R++;
        }
        return R - L - 1;
    }
}
