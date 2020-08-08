package com.wrk.algorithms.sort;

/**
 *  插入排序
 *  选定元素和前一个比较交换直到前一个元素比选定元素小
 *  外层从1开始，内层从已排好的最后一个（i）倒序比较直到第0个
 */
public class InsertionSort implements Sort{
    @Override
    public void sort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            for (int j = i; j > 0; j--) {
                if (list[j]<list[j-1]){
                    list[j-1]= list[j]^ list[j-1];
                    list[j]= list[j]^ list[j-1];
                    list[j-1]= list[j]^ list[j-1];
                }
            }
        }
    }
}
