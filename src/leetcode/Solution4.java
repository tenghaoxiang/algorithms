package leetcode;

public class Solution4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        final int m = nums1.length;
        final int n = nums2.length;
        int left = (m + n + 1) / 2;
        int right = (m + n + 2) / 2;
        return (getkth(nums1, 0, nums2, 0, left) + getkth(nums1, 0, nums2, 0, right)) / 2;

    }

    public double getkth(int[] A, int aStart, int[] B, int bStart, int k) {

        if (aStart > A.length - 1) {
            return B[bStart + k - 1];
        }
        if (bStart > B.length - 1) {
            return A[aStart + k - 1];
        }
        if (k == 1) {
            return Math.min(A[aStart], B[bStart]);
        }

        int aMid = Integer.MAX_VALUE;
        int bMid = Integer.MAX_VALUE;

        if (aStart + k / 2 - 1 < A.length) {
            aMid = A[aStart + k / 2 - 1];
        }

        if (bStart + k / 2 - 1 < B.length) {
            bMid = B[bStart + k / 2 - 1];
        }

        if (aMid < bMid) {
            return getkth(A, aStart + k / 2, B, bStart, k - k / 2);
        } else {
            return getkth(A, aStart, B, bStart + k / 2, k - k / 2);
        }

    }

}
