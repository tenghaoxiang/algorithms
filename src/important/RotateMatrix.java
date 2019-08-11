package important;

/**
 * @author tenghaoxiang
 * @date 2019/8/11 下午3:20
 * @Description 将一个矩阵旋转90度
 */
public class RotateMatrix {

    public void rotate(int[][] matrix) {

        if (matrix == null || matrix.length == 0 || (matrix.length == 1 && matrix[0].length == 0)) {
            return;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }

    }

}
