package leetcode.leetcode1;

import java.util.HashMap;
import java.util.Map;

// 方案 使用一遍哈希表 / hashMap
public class Solution {
    /*
    注意这个int[]返回值需求 以及 与结尾异常的关系
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            /*
            两数合 相较于最终的和 两个数互为一对 互为对方的补数
            这里的补数是特指
             */
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
