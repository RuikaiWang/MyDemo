package com.wrk;


public class LeetCode392 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("", "c"));
    }

    /**
     * 查找t中有没有顺序的非严格（可隔开）字串s
     * 双指针解法
     * @param s
     * @param t
     * @return
     */
        public static boolean isSubsequence(String s, String t) {
            char[] charss = s.toCharArray();
            if (charss.length<=0){return true;}
            char[] charst = t.toCharArray();
            int left = 0;
            int right = 0;
                for (right = 0;right<charst.length;right++){
                    if (charst[right] == charss[left]){
                        left++;
                    }
                    if (left == charss.length){
                        return true;
                    }
                }
            return false;
        }

}
