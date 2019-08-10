package important;

/**
 * @author tenghaoxiang
 * @date 2019/8/10 下午9:15
 * @Description 判断有序二维数组中是否有某个数
 */
public class FindInMatrix {

    public boolean find(int[][] array, int target){

        if (array == null || array.length == 0 || (array.length == 1 && array[0].length == 0)) {
            int row = 0;
            int col = array[0].length - 1;
            while (row <= array.length - 1 && col >= 0) {
                if (target == array[row][col]) {
                    return true;
                } else if (target > array[row][col]) {
                    row++;
                } else {
                    col--;
                }
            }
        }
        return false;

    }

}
