package com.hong.algorithm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hong.algorithm.algorithm.BubbleSort;

public class MainActivity extends AppCompatActivity {

    private int[] dest = {3,2,1,5,6,7,8,9,10};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] bubbleSort2 = BubbleSort.BubbleSort(dest);
        for (int i = 0; i < bubbleSort2.length; i++) {
            System.out.println("cuohe" + bubbleSort2[i] + "        ");
        }
    }
}
