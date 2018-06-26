package com.hong.algorithm.algorithm;

/**
 * Created by Administrator on 2018/6/25.
 */

public class BinarySearch {

    /**
     *  时间复杂度分析
     *
     * @param dest
     * @param value
     * @return
     */
    // 二分查找 使用条件：查找序列是顺序结构，有序。Ο(log2n)
    public static int binarySearch(int[] dest, int value) {
        int key = -1; // 返回要查找的值的位置，如果没有，返回-1
        int low = 0, high = dest.length - 1, mid = 0;
        // 如果不在数组中
        if (value < dest[low] || value > dest[high] || low > high) {
            return key;
        }
        while (low <= high) {
            mid = (high + low) / 2;
            if (dest[mid] > value) {
                high = mid - 1;
            } else if (dest[mid] < value) {
                low = mid + 1;
            } else if (dest[mid] == value) {
                key = mid;
                break;
            }
        }
        return key;
    }
}
