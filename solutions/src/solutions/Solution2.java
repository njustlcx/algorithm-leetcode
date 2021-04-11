package solutions;

import models.ListNode;
import utils.ListNodeUtils;

/**
 * @author lvchaoxian
 * @date 2021/4/10 7:34 上午
 */
public class Solution2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode res = new ListNode(0);
        ListNode p3 = res;
        int toAdd = 0;
        while (p1 != null || p2 != null) {
            int val = (p1 != null ? p1.val : 0) + (p2 != null ? p2.val : 0) + toAdd;
            p3.next = new ListNode(val % 10);
            p3 = p3.next;
            toAdd = val / 10;
            if (p1 != null) {
                p1 = p1.next;
            }
            if (p2 != null) {
                p2 = p2.next;
            }
        }
        if (toAdd == 1) {
            p3.next = new ListNode(toAdd);
        }
        return res.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNodeUtils.printListNode(addTwoNumbers(l1, l2));
    }
}
