package last;

/**
 * @author tenghaoxiang
 * @date 2019/9/16 下午9:51
 * @Description 堆排序
 */
public class HeapSort {

    int length;

    public void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        length = array.length;
        for (int i = length / 2; i >= 0; i--) {
            sink(array, i);
        }
        while (length > 0) {
            int help = array[0];
            array[0] = array[--length];
            array[length] = help;
            sink(array, 0);
        }
    }

    public void sink(int[] array, int i) {
        while (2 * i + 1 < length) {
            int j = 2 * i + 1;
            if (j < length - 1 && array[j] < array[j + 1]) {
                j++;
            }
            if (array[i] > array[j]) {
                break;
            }
            int help = array[i];
            array[i] = array[j];
            array[j] = help;
            i = j;
        }
    }

}
