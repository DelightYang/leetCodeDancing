package leetcode.leetcode101;

/**
 * leetcode101
 */

public class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    public boolean isSymmetric(TreeNode root) {

        /*
        先看根节点
         */
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }
//        这个基于root 引出左右很经典
        return isSymmetric(root.left, root.right);
    }

    //    用到了重载
    public boolean isSymmetric(TreeNode left, TreeNode right) {
//        还是要把上面方法中的情况再写一回
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }
        return (left.val == right.val) &&
                isSymmetric(left.left, right.right) &&
                isSymmetric(left.right, right.left);
    }

}
