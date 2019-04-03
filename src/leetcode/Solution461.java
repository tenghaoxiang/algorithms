package leetcode;

public class Solution461 {

    public int hammingDistance(int x, int y) {

        /**
         * 大佬的思路，直接使用异或，然后用Integer.bitCount()来统计此二进制数中有多少个1
         * 一行就解决了问题！！！
         */
        return Integer.bitCount(x ^ y);

        /**
         * 另一种思路，用位运算与1进行＆运算，统计１的个数
         */
//        int xor = x ^ y, count = 0;
//        for (int i=0;i<32;i++) count += (xor >> i) & 1;
//        return count;

        /**
         * 我的思路就是一个个对比，想不到更好的办法，太菜了...
         */
//        String s1 = Integer.toBinaryString(x);
//        String s2 = Integer.toBinaryString(y);
//        return 0;
    }

}
