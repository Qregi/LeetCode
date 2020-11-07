package com.java.leetCode.code;

import java.util.ArrayList;
import java.util.List;

public class Plaindrome {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int revertNum = 0;
        List<Integer> allNumList = new ArrayList<>();
        int num = x;
        while(num > 0) {
            int middleNum = num % 10;
            allNumList.add(middleNum);
            num = num / 10;
        }
        int i = allNumList.size() - 1;
        int j = 0;
        while (i >= 0 && j < allNumList.size()) {
            double testNum = Math.pow(10, i);
            if (testNum == Double.MAX_VALUE) {
                testNum = 0;
            }
            revertNum += allNumList.get(j) * Math.pow(10, i);
            System.out.println(testNum);
            --i;
            ++j;
        }

        if (revertNum == x) {
            return true;
        }
        return false;
    }
}
