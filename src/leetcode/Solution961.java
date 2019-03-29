package leetcode;
import java.util.HashSet;
import java.util.Set;

public class Solution961 {

    public int repeatedNTimes(int[] A) {
        final int length = A.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < length; i++) {
            if (set.contains(A[i])) {
                return A[i];
            } else {
                set.add(A[i]);
            }
        }
        return 0;
    }

}
