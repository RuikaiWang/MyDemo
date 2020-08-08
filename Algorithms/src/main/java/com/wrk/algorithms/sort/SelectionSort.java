package com.wrk.algorithms.sort;


/**
 * 选择排序
 * 外层选定一个元素 和内层循环最小的数交换
 * 每次外层遍历 前i+1个元素有序 内层从i开始即可
 */
public class SelectionSort implements Sort {
    @Override
    public void sort(int[] list) {
        int min,temp = 0;
        for (int i = 0; i < list.length; i++) {
            min = i;
            for (int j = i; j < list.length; j++) {
                if (list[j]<list[min]){
                    min = j;
                }
            }
            temp = list[i];
            list[i] = list[min];
            list[min] = temp;
        }
    }
}
