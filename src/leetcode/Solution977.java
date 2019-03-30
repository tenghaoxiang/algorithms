package leetcode;


public class Solution977 {

    /**
     *　大佬的思路，充分利用递增
     */
    public int[] sortedSquares(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        int i = 0, j = n - 1;
        for (int p = n - 1; p >= 0; p--) {
            if (Math.abs(A[i]) > Math.abs(A[j])) {
                result[p] = A[i] * A[i];
                i++;
            } else {
                result[p] = A[j] * A[j];
                j--;
            }
        }
        return result;
    }

    /**
     * 希尔排序
     */
//    public int[] sortedSquares(int[] A) {
//        final int length = A.length;
//        int m;
//        int h = 1;
//        while (h < length / 3) {
//            h = 3 * h + 1;
//        }
//        for (int i = 0; i < length; i++) {
//            A[i] = A[i] * A[i];
//        }
//        while (h >= 1) {
//            for (int i = 0; i < length; i++) {
//                for (int j = i; j >= h && A[j] < A[j - h]; j = j - h) {
//                    m = A[j - h];
//                    A[j - h] = A[j];
//                    A[j] = m;
//                }
//            }
//            h = h / 3;
//        }
//        return A;
//    }

    /**
     * 归并排序
     */
//    private int[] copy;
//    public int[] sortedSquares(int[] A) {
//
//        final int length = A.length;
//        copy = new int[length];
//        for (int i = 0; i < length; i++) {
//            A[i] = A[i] * A[i];
//        }
//        sort(A, 0, length - 1);
//        return A;
//
//    }
//
//    public void sort(int[] A, int lo, int hi) {
//        if (hi <= lo) {
//            return;
//        }
//        int mid = lo + (hi - lo) / 2;
//        sort(A, lo, mid);
//        sort(A, mid + 1, hi);
//        merge(A, lo, mid, hi);
//    }
//
//    public void merge(int[] A, int lo, int mid, int hi) {
//        int m = lo;
//        int n = mid + 1;
//        for (int i = lo; i <= hi; i++) {
//            copy[i] = A[i];
//        }
//        for (int i = lo; i <= hi; i++) {
//            if (m > mid) {
//                A[i] = copy[n++];
//            } else if (n > hi) {
//                A[i] = copy[m++];
//            } else if (copy[m] < copy[n]) {
//                A[i] = copy[m++];
//            } else {
//                A[i] = copy[n++];
//            }
//        }
//    }

}
