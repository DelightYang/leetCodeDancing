package leetcode.leetcode70;

/**
 * leetcode70
 */

public class Solution {
    public int climbStairs(int stairs) {
        if (stairs == 0 || stairs == 1 || stairs == 2) {
            return stairs;
        }

//        paths存有多少份数据，取决于楼梯数
        int[] paths = new int[stairs];
//        一层台阶
        paths[0] = 1;
//        两层台阶
        paths[1] = 2;

        for (int i = 2; i < stairs; i++) {
            paths[i] = paths[i - 1] + paths[i - 2];
        }

//        其实就是返回最后一个
        return paths[stairs - 1];
    }
}
