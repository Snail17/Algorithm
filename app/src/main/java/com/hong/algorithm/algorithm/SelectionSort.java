package com.hong.algorithm.algorithm;

/**
 * Created by XIAOHONG
 * Author: XIAOHONG.
 * Date: 2018/6/25.
 */

public class SelectionSort {

    /**
     * 第一次内循环比较N - 1次，然后是N-2次，N-3次，……，最后一次内循环比较1次。
     * 共比较的次数是 (N - 1) + (N - 2) + ... + 1，求等差数列和，得 (N - 1 + 1)* N / 2 = N^2 / 2。
     * 舍去最高项系数，其时间复杂度为 O(N^2)。
     * @param dest
     * @return
     */
    //选择排序 时间复杂度 O(n^2)
    public static int[] selectionSort(int[] dest) {
        int temp;
        int differMin = Integer.MAX_VALUE; // 记录比较之后最小的值
        int differValue = 0; // 记录比较之后小的值的坐标
        int length = dest.length;
        boolean flag = false; // 判断是否有比要比较的值的小的值
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (dest[i] > dest[j]) {
                    if (differMin > dest[j]) {
                        differMin = dest[j];
                        differValue = j;
                        flag = true;
                    }
                }
            }
            if (flag) {
                // 每次 找最小值的时候都要重新初始化标志位
                flag = false;
                differMin = Integer.MAX_VALUE;
                temp = dest[differValue];
                dest[differValue] = dest[i];
                dest[i] = temp;
            }
        }
        return dest;
    }

    public static int[] selectionSort1(int[] arr) {
        //选择排序的优化
        for (int i = 0; i < arr.length - 1; i++) {// 做第i趟排序
            int k = i;
            for (int j = k + 1; j < arr.length; j++) {// 选最小的记录
                if (arr[j] < arr[k]) {
                    k = j; //记下目前找到的最小值所在的位置
                }
            }
            //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
            if (i != k) {  //交换a[i]和a[k]
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
        return arr;
    }
}
