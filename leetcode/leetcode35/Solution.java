package leetcode.leetcode35;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int insert = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                insert++;
            } else {
                /*
                这里最好要有break,
                因为一旦插入完成 就可以终止循环了
                 */
                break;
            }
        }
        return insert;
    }
}
