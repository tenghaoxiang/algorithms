package sort;

public class MergeSortUpDown {

    private static Comparable[] copy;

    public static <T extends Comparable<? super T>> void mergeSortUpDown(T[] a) {
        copy = new Comparable[a.length];
        mergeSortUpDown(a, 0, a.length - 1);
    }

    public static <T extends Comparable<? super T>> void mergeSortUpDown(T[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi-lo)/2;
        mergeSortUpDown(a, lo, mid);
        mergeSortUpDown(a, mid + 1, hi);
        merge(a, lo, mid, hi);

    }

    public static <T extends Comparable<? super T>> void merge(T[] a, int lo, int mid, int hi) {
        int m = lo, n = mid + 1;
        for (int i = lo; i <= hi; i++) {
            copy[i] = a[i];
        }
        for (int i = lo; i <= hi; i++) {
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
