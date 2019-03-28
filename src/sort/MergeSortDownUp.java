package sort;

public class MergeSortDownUp {

    private static Comparable[] copy;
    public static <T extends Comparable<? super T>> void mergeSortDownUp(T[] a) {
        int length = a.length;
        copy = new Comparable[length];
        for (int size = 1; size < length; size = size + size) {
            for (int lo = 0; lo < length - size; lo = lo + size + size) {
                merge(a, lo, lo + size - 1, Math.min(lo + size + size - 1, length - 1));
            }
        }
    }

    public static <T extends Comparable<? super T>> void merge(T[]a, int lo, int mid, int hi) {
        int m = lo, n = mid + 1;
        for (int i = lo; i <= hi ; i++) {
            copy[i] = a[i];
        }
        for (int i = lo; i <= hi ; i++) {
            if (m > mid) {
                a[i] = (T) copy[n++];
            } else if (n > hi) {
                a[i] = (T) copy[m++];
            } else if (copy[m].compareTo(copy[n]) < 0) {
                a[i] = (T) copy[m++];
            } else {
                a[i] = (T) copy[n++];
            }
        }
    }

}
