package com.java.leetCode.code;

import com.java.leetCode.Entity.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrderTree {

    public void run() {
        TreeNode node = new TreeNode();
        node.val = 1;
        ArrayList<Integer> result = postorderTraversal(node);
        System.out.println("链表打印： ");
        result.forEach(item -> {
            System.out.print(item + " ");
        });
    }

    public ArrayList<Integer> postorderTraversal (TreeNode root) {
        // write code here
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            TreeNode cur = stack1.pop();
            stack2.push(cur);
            if (cur.left != null) {
                stack1.push(cur.left);
            }
            if (cur.right != null) {
                stack1.push(cur.right);
            }
        }
        while (!stack2.isEmpty()) {
            result.add(stack2.pop().val);
        }
        return result;
    }
}
