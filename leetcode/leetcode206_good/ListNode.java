package leetcode.leetcode206_good;

/**
 * leetcode206
 */

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextTemp = current.next;
            /*
            这一要做一个颠倒 是逻辑核心
            涉及到 prev，current，next 三个元素的重新赋值
            不过这些都是另开的新空间，不会影响原数据。
             */
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        return prev;
    }
}
