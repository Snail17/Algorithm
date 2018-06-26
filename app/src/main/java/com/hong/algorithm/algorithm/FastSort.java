package com.hong.algorithm.algorithm;

/**
 * Created by Administrator on 2018/6/25.
 */

public class FastSort {

    /**
     * https://blog.csdn.net/qfikh/article/details/52870875
     * 最坏条件下 和冒泡类似 O(n^2)
     *
     * @param dest
     * @param low
     * @param high
     * @return
     */
    // 快速排序 3， 2， 4，10
    public static int[] fastSort(int[] dest, int low, int high) {
        int key = dest[low]; // 基数
        boolean flag = true;
        int left = low;
        int right = high;
        while (left < right) {
            // 从右开始找小于fast的
            while (flag && left < right) {
                if (key > dest[right]) {
                    dest[left] = dest[right];
                    dest[right] = key;
                    left++;
                    break;
                }
                right--;
            }
            flag = true;
            // 从左开始找大于fast的
            while (flag && left < right) {
                if (key < dest[left]) {
                    dest[right] = dest[left];
                    dest[left] = key;
                    right--;
                    break;
                }
                left++;
            }

        }
        // 前半部分排序
        if (left > low) {
            fastSort(dest, low, left - 1);
        }
        // 后半部分排序
        if (right < high) {
            fastSort(dest, right + 1, high);
        }
        return dest;
    }
}
