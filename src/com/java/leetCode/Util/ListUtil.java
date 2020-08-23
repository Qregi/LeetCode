package com.java.leetCode.Util;

import com.java.leetCode.Entity.ListNode;

/**
 * @Author 邱夏
 * @Date 2020/08/23 15:26
 */
public class ListUtil {

    /**
     * 打印链表
     * @param node
     */
    public static void printList(ListNode node) {
        if (node == null) {
            System.out.println("链表为空");
            return;
        }
        while (node != null) {

            System.out.print("[" + node.val + "]");
            System.out.print("->");
            node = node.next;
        }
        System.out.print("null");
        System.out.println();
    }
}

