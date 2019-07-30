package exerciese;

import java.util.Comparator;

/**
 * @author tenghaoxiang
 * @date 2019/7/30 下午9:07
 * @Description
 */
public class QuickSort {

    public <T extends Comparable> void sort(T[] array) {

        sort(array, 0, array.length - 1);

    }

    public <T extends Comparable> void sort(T[] array, int left, int right) {

        if (left >= right) {
            return;
        }
        int index = partition(array, left, right);
        sort(array, left, index - 1);
        sort(array, index + 1, right);

    }

    public <T extends Comparable> int partition(T[] array, int left, int right) {

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

    public static <T extends Comparable> void main(String[] args) {
        T[] array = (T[]) new Comparable[]{99, 28, -922, 0, -82, 23, -2, 11, 8};
        QuickSort sort = new QuickSort();
        sort.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
