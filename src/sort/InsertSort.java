package sort;

public class InsertSort {

    public static <T extends Comparable<? super T>> void insertSort(T[] a) {

        int length = a.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0 && (a[j].compareTo(a[j-1]) < 0); j--){
                    T m = a[j-1];
                    a[j-1] = a[j];
                    a[j] = m;
            }
        }

    }

}
