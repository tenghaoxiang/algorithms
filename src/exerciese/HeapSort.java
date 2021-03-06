package exerciese;

/**
 * @author tenghaoxiang
 * @date 2019/7/30 下午9:19
 * @Description
 */
public class HeapSort {

    int length;

    public <T extends Comparable> void sort(T[] array) {

        length = array.length;
        for (int i = length / 2; i >= 0; i--) {
            sink(array, i);
        }
        while (length > 0) {
            T num = array[0];
            array[0] = array[--length];
            array[length] = num;
            sink(array, 0);
        }

    }

    public <T extends Comparable> void sink(T[] array, int i) {

        while (i * 2 + 1 < length) {

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

    public static <T extends Comparable> void main(String[] args) {
        T[] array = (T[]) new Comparable[]{19, 23, -123, 32, 0, 18, 0, -232, 13, 3, 238};
        HeapSort sort = new HeapSort();
        sort.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
