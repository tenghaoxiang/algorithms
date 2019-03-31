package leetcode;

public class Solution905 {

    public int[] sortArrayByParity(int[] A) {

        final int length = A.length;
        int m = -1;
        int n = length;
        while (true) {
            while (A[++m] % 2 == 0) {
                if (m == length - 1) {
                    break;
                }
            }
            while (A[--n] % 2 != 0) {
                if (n == 0) {
                    break;
                }
            }
            if (n <= m) {
                break;
            }
            int k = A[m];
            A[m] = A[n];
            A[n] = k;
        }
        return A;

    }

}
