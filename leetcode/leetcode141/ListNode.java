package leetcode.leetcode141;

/**
 * leetcode 141
 */

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public boolean hasCycle(ListNode head) {
        /*
        一个节点自己不能指向自己，
        两个节点，第二个节点需要指回第一个，才是环
         */
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null||fast.next==null) {
                return false;
            }
//            步进一步
            slow = slow.next;
//            步进两步
            fast = fast.next.next;
        }

        return true;
    }

}
