package com.java.leetCode.code;


import com.java.leetCode.Entity.ListNode;

import java.util.Set;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class AddToNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode result = new ListNode();
        ListNode current = result;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                current.next = l2;
                l2 = l2.next;
                current = current.next;
                continue;
            }
            if (l2 == null) {
                current.next = l1;
                l1 = l1.next;
                current = current.next;
                continue;
            }
            ListNode node = new ListNode(l1.val + l2.val);
            current.next = node;
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (result.next == null) {
            return null;
        }
        // 进位
        current = result.next;
        while (current != null) {
            if (current.val >= 10) {
                current.val = current.val - 10;
                if (current.next == null) {
                    current.next = new ListNode(0);
                }
                current.next.val = current.next.val + 1;
            }
            current = current.next;
        }
        return result.next;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        String s = "";
        s.length();
        int i = 0;
        Character currentChar = s.charAt(i);
        System.out.println();
        
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head = new ListNode();
        ListNode current = head;
        boolean isCarry = false;
        while (l1 != null || l2 != null) {
            int num;
            if (l1 == null) {
                num = l2.val;
            } else if (l2 == null) {
                num = l1.val;
            } else {
                num = l1.val + l2.val;
            }
            if (isCarry) {
                num += 1;
            }
            if (num >= 10) {
                isCarry = true;
            }
            ListNode node = new ListNode(num % 10);
            current.next = node;
            current = node;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        return head.next;
    }
}
