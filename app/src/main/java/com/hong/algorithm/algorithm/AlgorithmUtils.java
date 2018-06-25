package com.hong.algorithm.algorithm;

/**
 * Created by Administrator on 2018/6/25.
 */

public class AlgorithmUtils {
    // 冒泡
    public static int[] BubbleSort(int[] dest) {
        int length = dest.length;
        int pre;
        for (int i = 0; i < length  -1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (dest[j] > dest[j + 1]) {
                    pre = dest[j];
                    dest[j] = dest[j + 1];
                    dest[j + 1] = pre;
                }
            }
        }
        return dest;
    }
    // 冒泡优化
    public static int[] BubbleSort2(int[] dest) {
        int length = dest.length;
        boolean flag = true; //发生了交换就为true, 没发生就为false，第一次判断时必须标志位true。对于有序的数组减少判断
        int pre;
        int k = 0;
        while (flag) {
            flag = false;
            for (int j = 0; j < length - k - 1; j++) {
                if (dest[j] > dest[j + 1]) {
                    pre = dest[j];
                    dest[j] = dest[j + 1];
                    dest[j + 1] = pre;
                    flag = true;
                }
            }
            k++;
        }
        return dest;
    }

    // 二分

    // 快速

}
