package com.hong.algorithm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hong.algorithm.algorithm.BinarySearch;
import com.hong.algorithm.algorithm.SelectionSort;

public class MainActivity extends AppCompatActivity {

    private int[] dest = {3, 2, 1, 5, 6, 7, 8, 9, 10};

    private int[] fastDest = {5, 2, 4, 6, 1, 7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        int[] sortArr = BubbleSort.bubbleSort(dest);
//        int[] sortArr = FastSort.fastSort(fastDest, 0, fastDest.length - 1);
        int[] sortArr = SelectionSort.selectionSort(dest);
        for (int i = 0; i < sortArr.length; i++) {
            System.out.print(sortArr[i] + "        ");
        }
        System.out.println("cuohe" + BinarySearch.binarySearch(sortArr, 10));

    }
}
