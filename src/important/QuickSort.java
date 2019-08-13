package important;

/**
 * @author tenghaoxiang
 * @date 2019/8/13 下午2:30
 * @Description
 */
public class QuickSort {

    public <T extends Comparable> void sort(T[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        sort(array, 0, array.length - 1);
    }

    public <T extends Comparable> void sort(T[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int k = partition(array, left, right);
        sort(array, left, k - 1);
        sort(array, k + 1, right);
    }

    private <T extends Comparable> int partition(T[] array, int left, int right) {

        T num = array[left];
        int i = left;
        int j = right + 1;
        while (true) {
            while (array[++i].compareTo(num) < 0) {
                if (i >= right) {
                    break;
                }
            }
            while (array[--j].compareTo(num) > 0) {

            }
            if (i >= j) {
                break;
            }
            T help = array[i];
            array[i] = array[j];
            array[j] = help;
        }
        array[left] = array[j];
        array[j] = num;
        return j;

    }

}
