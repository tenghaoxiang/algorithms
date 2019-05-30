package offer;

import java.util.ArrayList;

public class Solution29 {

    public ArrayList<Integer> printMatrix(int [][] matrix) {

        ArrayList<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix.length == 1 && matrix[0].length == 0) {
            return res;
        }

        int row = matrix.length;
        int column = matrix[0].length;
        int left = 0 ,top = 0, right = column - 1, bottom = row - 1;
        while (left <= right && top <= bottom) {

            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            for (int i = top + 1; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            if (top != bottom) {
                for (int i = right - 1; i >= left; --i) {
                    res.add(matrix[bottom][i]);
                }
            }
            if (left != right) {
                for (int i = bottom - 1; i > top; --i) {
                    res.add(matrix[i][left]);
                }
            }
            left++;
            top++;
            right--;
            bottom--;

        }
        return res;

    }

}
