package com.wrk;

/**
 * 这个暴力解法等于没解。。。。
 */
public class LeetCode0803 {
    public static int findMagicIndex(int[] nums) {
        int i = 0;
        do {
            if (nums[i] == i) {
                return i;
            }
            i++;
        } while (i < nums.length);
        return -1;
    }

    public static void main(String[] args) {
        int index = findMagicIndex(new int[]{6, 2, 3, 3, 5});
        System.out.println(index);
    }
}
