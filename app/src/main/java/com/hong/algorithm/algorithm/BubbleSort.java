package com.hong.algorithm.algorithm;

/**
 * Created by Administrator on 2018/6/25.
 */

public class BubbleSort {
    // 简单的冒泡
    public static int[] BubbleSort(int[] dest) {
        int length = dest.length;
        int pre;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                System.out.println("cuohe" + "fhjfhjfhjfhjf" + i);
                if (dest[j] > dest[j + 1]) {
                    pre = dest[j];
                    dest[j] = dest[j + 1];
                    dest[j + 1] = pre;

                }
            }
        }
        return dest;
    }

    // 冒泡优化1 处理 1，，2，3，4，5，6，，7， 没有发生交换或者中间某个过程之后不再发生交换
    public static int[] BubbleSort1(int[] dest) {
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

    // 冒泡优化2  处理 3，2，4，5，6，7，8，9，10（后面又10000个数据 兼容上面优化）
    public static int[] BubbleSort2(int[] dest) {
        int flag = dest.length - 1; //发生了交换就为true, 没发生就为false，第一次判断时必须标志位true。对于有序的数组减少判断
        int pre;
        int k ;
        while (flag > 0) {
            k = flag;
            flag = 0;
            for (int j = 0; j < k; j++) {
                System.out.println("cuohe" + "fhjfhjfhjfhjf" + k);

                if (dest[j] > dest[j + 1]) {
                    pre = dest[j];
                    dest[j] = dest[j + 1];
                    dest[j + 1] = pre;
                    flag = j;
                }
            }
        }
        return dest;
    }


}
