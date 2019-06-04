package leetcode.leetcode367

/**
 * leetcode367
 */

class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        if (num < 4) {
            return false;
        }

        double mid = 0, left = 0, right = Integer.MAX_VALUE;

        while (left <= right) {
            mid = (int) (left + right) / 2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return false;
    }
}
