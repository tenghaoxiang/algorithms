package sort;

public class ShellSort {

    public static <T extends Comparable<? super T>> void shellSort(T[] a){

        int length = a.length;
        int h = 1;
        while (h < length / 3) {
            h = h * 3 + 1;
        }
        while (h >= 1) {
            for (int i = h; i < length; i++) {
                for (int j = i; j >= h && (a[j].compareTo(a[j - h])) < 0; j -= h) {
                    T m = a[j - h];
                    a[j - h] = a[j];
                    a[j] = m;
                }
            }
            h = h / 3;
        }

    }

}
