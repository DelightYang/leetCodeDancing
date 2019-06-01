package leetcode.leetcode69;

public class Solution {

    public int getSqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        /**
         * 设左右边界
         * 左边界是1，因为x现在肯定大于1
         * 右边界是x，也就是被开根的数
         */

        int left = 1, right = x;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (mid > x / mid) {
                right = mid;
            } else {
                left = mid;
            }
        }

        if (right <= x / right) {
            return right;
        }

        return left;
    }

}
