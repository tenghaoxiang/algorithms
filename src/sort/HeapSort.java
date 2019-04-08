package sort;

public class HeapSort {

    static int length;

    public static <T extends Comparable<? super T>> void heapSort(T[] num) {
        length = num.length;
        for (int k = length / 2; k >= 0; k--) {
            sink(num, k);
        }
        while (length > 0) {
            T m = num[0];
            num[0] = num[--length];
            num[length] = m;
            sink(num, 0);
        }
    }

    public static <T extends Comparable<? super T>> void sink(T[] num, int k) {
        while (k * 2 + 1 <= length - 1) {
            int j = 2 * k + 1;
            if (j < length - 1 && num[j].compareTo(num[j + 1]) < 0) {
                j = j + 1;
            }
            if (num[k].compareTo(num[j]) > 0) {
                break;
            }
            T m = num[k];
            num[k] = num[j];
            num[j] = m;
            k = j;
        }
    }

}
