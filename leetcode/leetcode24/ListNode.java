package leetcode.leetcode24;

/**
 * leetcode24
 */

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode a = head;
        ListNode b = head.next;

        a.next = b.next;
        b.next = a;
        a.next = swapPairs(a.next);

        return b;
    }
}
