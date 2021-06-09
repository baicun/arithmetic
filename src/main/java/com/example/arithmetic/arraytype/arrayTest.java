package com.example.arithmetic.arraytype;

import java.util.HashMap;

/**
 * @ClassName : arrayTest
 * @Description : 数组类题目
 * @Author : baicun
 * @Date: 2021-3-3
 * @Version V1.0
 */
public class arrayTest {
    public static void main(String[] args2) {
        int args = 5;
        int[] bits = new int[args + 1];
        for (int i = 0; i <= args; i++) {
            bits[i] = countOnes(i);
        }
        System.out.println("bits = [" + bits.toString() + "]");
    }

    public static int countOnes(int x) {
        int ones = 0;
        while (x > 0) {
            x &= (x - 1);
            ones++;
        }
        System.out.println("ones = [" + ones + "]");
        return ones;
    }

}
