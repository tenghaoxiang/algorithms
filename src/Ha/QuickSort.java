package Ha;

/**
 * @author tenghaoxiang
 * @date 2019/9/10 下午9:29
 * @Description
 */
public class QuickSort {

    public void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        sort(array, 0, array.length - 1);
    }

    public void sort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int k = partition(array, left, right);
        sort(array, left, k - 1);
        sort(array, k + 1, right);
    }

    public int partition(int[] array, int left, int right) {

        int num = array[left];
        int i = left;
        int j = right + 1;
        while (true) {

            while (array[++i] < num) {
                if (i >= right) {
                    break;
                }
            }
            while (array[--j] > num) {

            }
            if (i >= j) {
                break;
            }
            int help = array[i];
            array[i] = array[j];
            array[j] = help;

        }
        array[left] = array[j];
        array[j] = num;
        return j;

    }

}
