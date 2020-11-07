package com.java.leetCode.code;

/**
 * @Author xia.qiu
 * @Date 2020/11/17
 */
public class ConvertNum {
    public int reverse(int x) {
        long revertNum = 0;
        while(x != 0) {
            revertNum = revertNum * 10 + x % 10;
            x /= 10;
        }
        return revertNum > Integer.MAX_VALUE ? 0 : (int)revertNum;
    }
}
