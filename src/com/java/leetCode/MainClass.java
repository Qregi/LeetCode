package com.java.leetCode;

        import com.java.leetCode.Entity.ListNode;
        import com.java.leetCode.code.*;

/**
 * @Author 邱夏
 * @Date 2020/08/23 15:20
 */
/* -----------------------------------
 *  WARNING:
 * -----------------------------------
 *  Your code may fail to compile
 *  because it contains public class
 *  declarations.
 *  To fix this, please remove the
 *  "public" keyword from your class
 *  declarations.
 */

public class MainClass {


    public static void main(String[] args)  {
        AddToNumber addToNumber = new AddToNumber();
        /**
         *         ListNode listNode1_1 = new ListNode(2);
         *         ListNode listNode1_2 = new ListNode(4);
         *         ListNode listNode1_3 = new ListNode(3);
         *         listNode1_1.next = listNode1_2;
         *         listNode1_2.next = listNode1_3;
         *
         *
         *         ListNode listNode2_1 = new ListNode(5);
         *         ListNode listNode2_2 = new ListNode(6);
         *         ListNode listNode2_3 = new ListNode(4);
         *         listNode2_1.next = listNode2_2;
         *         listNode2_2.next = listNode2_3;
         */
        //         ListNode listNode1_1 = new ListNode(9);
        //        ListNode listNode1_2 = new ListNode(9);
        //        ListNode listNode1_3 = new ListNode(9);
        //        ListNode listNode1_4 = new ListNode(9);
        //        ListNode listNode1_5 = new ListNode(9);
        //        ListNode listNode1_6 = new ListNode(9);
        //        ListNode listNode1_7 = new ListNode(9);
        //
        //        listNode1_1.next = listNode1_2;
        //        listNode1_2.next = listNode1_3;
        //        listNode1_3.next = listNode1_4;
        //        listNode1_4.next = listNode1_5;
        //        listNode1_5.next = listNode1_6;
        //        listNode1_6.next = listNode1_7;
        //
        //
        //        ListNode listNode2_1 = new ListNode(9);
        //        ListNode listNode2_2 = new ListNode(9);
        //        ListNode listNode2_3 = new ListNode(9);
        //        ListNode listNode2_4 = new ListNode(9);
        //        listNode2_1.next = listNode2_2;
        //        listNode2_2.next = listNode2_3;
        //        listNode2_3.next = listNode2_4;
        //        ListNode node = addToNumber.addTwoNumbers2(listNode1_1, listNode2_1);
        //        int i = 0;

        // int i = 2147483647;
        //        Plaindrome plaindrome = new Plaindrome();
        //
        //        boolean result = plaindrome.isPalindrome(i);
        //        System.out.println(result);

     //   MaxPlainDromeString maxPlainDromeString = new MaxPlainDromeString();
        //        String inputString = "a";
        //        String result = maxPlainDromeString.longestPalindrome3(inputString);
        //        System.out.println(result);

        ConvertNum convertNum = new ConvertNum();
        int num = convertNum.reverse(-123);
        System.out.println(num);
    }
}