package leetcode;

public class Solution944 {

    public int minDeletionSize(String[] A) {

        int sum = 0;
        char[][] strings = new char[A.length][];
        for (int i = 0; i < A.length; i++) {
            strings[i] = A[i].toCharArray();
        }
        for (int i = 0; i < A[0].length(); i++) {
            for (int j = 1; j < A.length; j++) {
                if (strings[j][i] < strings[j - 1][i]) {
                    sum += 1;
                    break;
                }
            }
        }
        return sum;

    }

}
