package review;

/**
 * @author tenghaoxiang
 * @date 2019/8/11 上午9:25
 * @Description
 */
public class FindInMatrix {

    public boolean find(int[][] matrix, int target){

        if (matrix == null || matrix.length == 0 || (matrix.length == 1 && matrix[0].length == 0)) {
            int row = 0;
            int col = matrix[0].length - 1;
            while (row <= matrix.length - 1 && col >= 0) {
                if (matrix[row][col] > target) {
                    col--;
                } else if (matrix[row][col] < target) {
                    row++;
                } else {
                    return true;
                }
            }
        }
        return false;

    }

}
