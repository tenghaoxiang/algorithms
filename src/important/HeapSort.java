package important;

/**
 * @author tenghaoxiang
 * @date 2019/8/13 下午2:39
 * @Description 堆排序
 *
 */
public class HeapSort {

    int length;

    public <T extends Comparable> void sort(T[] array) {

        if (array == null || array.length == 0) {
            return;
        }
        length = array.length;
        for (int i = length / 2; i >= 0; i--) {
            sink(array, i);
        }
        while (length > 0) {
            T help = array[0];
            array[0] = array[--length];
            array[length] = help;
            sink(array, 0);
        }

    }

    public <T extends Comparable> void sink(T[] array, int i) {

        while (2 * i + 1 < length) {

            int j = 2 * i + 1;
            if (j < length - 1 && array[j].compareTo(array[j + 1]) < 0) {
                j++;
            }
            if (array[i].compareTo(array[j]) > 0) {
                break;
            }
            T help = array[i];
            array[i] = array[j];
            array[j] = help;
            i = j;

        }

    }

}
