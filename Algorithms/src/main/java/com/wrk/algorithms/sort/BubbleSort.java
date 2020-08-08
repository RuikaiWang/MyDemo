package com.wrk.algorithms.sort;

import java.util.List;

/**
 * 冒泡
 * 相邻的两个比较，把较大的换到最后，然后循环比较前面i-1个
 * 外层每遍历一次后i+1个数字就是有序的  内层只需要遍历0到size-i个元素就够了
 */
public class BubbleSort implements Sort{
    @Override
    public void sort(int[] list) {
        int temp;
        for (int i = 0; i < list.length-1; i++) {
            for (int j = 0; j < list.length-1-i; j++) {
                if (list[j] > list[j+1]){
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }
}
