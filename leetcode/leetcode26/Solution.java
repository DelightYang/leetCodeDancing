package leetcode.leetcode26;

/**
 * leetcode 26
 */

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0||nums.length==1) {
            return nums.length;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
//                这句不懂
                nums[j] = nums[i];
            }
        }
//        最终返回的是新数组长度
        return j + 1;
    }
}
