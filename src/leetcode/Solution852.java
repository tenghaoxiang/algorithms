package leetcode;

public class Solution852 {

    public int peakIndexInMountainArray(int[] A) {
        for (int i = 0; i + 1 < A.length; ++i) if (A[i] > A[i + 1]) return i;
        return 0;
    }

}
