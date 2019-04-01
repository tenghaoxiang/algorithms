package leetcode;

public class Solution832 {

    /**
     *　虽然我想到了很好的办法，但远没有大佬们的简洁，继续加油
     */
    public int[][] flipAndInvertImage(int[][] A) {
        int n = A.length;
        for (int[] row : A)
            for (int i = 0; i * 2 < n; i++)
                if (row[i] == row[n - i - 1])
                    row[i] = row[n - i - 1] ^= 1;
        return A;
    }

//    public int[][] flipAndInvertImage(int[][] A) {
//        final int length = A.length;
//        for (int i = 0; i < length; i++) {
//            final int k = A[i].length;
//            int m = -1;
//            int n = k;
//            while (true) {
//                if (--n < ++m) {
//                    break;
//                }
//                if (A[i][m] + A[i][n] == 1) {
//
//                } else if (A[i][m] == 0 && A[i][n] == 0) {
//                    A[i][m] = 1;
//                    A[i][n] = 1;
//                } else {
//                    A[i][m] = 0;
//                    A[i][n] = 0;
//                }
//            }
//        }
//        return A;
//    }

}
