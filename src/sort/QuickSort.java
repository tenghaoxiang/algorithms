package sort;

public class QuickSort {

    public static <T extends Comparable <? super T>> void sort(T[] a) {
        sort(a, 0, a.length - 1);
    }

    public static <T extends Comparable<? super T>> void sort(T[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int k = partition(a, lo, hi);
        sort(a, lo, k - 1);
        sort(a, k + 1, hi);
    }

    public static <T extends Comparable<? super T>> int partition(T[] a, int lo, int hi) {
        T num = a[lo];
        int i = lo;
        int j = hi + 1;
        while (true) {
            while (a[++i].compareTo(num) < 0) {
                if (i >= hi) {
                    break;
                }
            }
            while (a[--j].compareTo(num) > 0) {

            }
            if (i >= j) {
                break;
            }
            T n = a[i];
            a[i] = a[j];
            a[j] = n;
        }
        T m = a[lo];
        a[lo] = a[j];
        a[j] = m;
        return j;
    }

}
