package com.java.leetCode.code;

import com.java.leetCode.Entity.ListNode;
import com.java.leetCode.Util.ListUtil;

/**
 * @Author 邱夏
 * @Date 2020/08/23
 * 两个有序链表合并
 */
public class MergeList {

    public void run() {
        ListNode node1 = new ListNode();
        node1.val = 2;
        ListNode node2 = new ListNode();
        node2.val = 1;
        ListNode result = mergeTwoLists2(node1, node2);
        ListUtil.printList(result);
    }

    private ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        // write code here
        if (l1 ==  null && l2 == null) {
            return null;
        }
        ListNode head = null;
        if (l1 == null) {
            head = l2;
            l2 = l2.next;
        } else if (l2 == null) {
            head = l1;
            l1 = l1.next;
        } else {
            if (l1.val > l2.val) {
                head = l2;
                l2 = l2.next;
            } else {
                head = l1;
                l1 = l1.next;
            }
        }
        ListNode cur = head;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                cur.next = l2;
                l2 = l2.next;
            } else {
                cur.next = l1;
                l1 = l1.next;
            }
            cur = cur.next;
        }
        if (l1 == null) {
            cur.next = l2;
        }
        if (l2 == null) {
            cur.next = l1;
        }
        return head;
    }


    /**
     * 方法二，更简洁一下，看别人的
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists2 (ListNode l1, ListNode l2) {
        // write code here
        ListNode head = new ListNode();
        ListNode cur = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if (l1 != null) {
            cur.next = l1;
        }
        if (l2 != null) {
            cur.next = l2;
        }
        return head.next;
    }
}
