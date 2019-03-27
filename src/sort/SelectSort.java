package sort;

public class SelectSort {

    public static <T extends Comparable<? super T>> void selectSort(T[] a){

        int length = a.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for(int j = i+1; j < length; j++){
                if(a[j].compareTo(a[min]) < 0){
                    min = j;
                }
            }
            T m = a[i];
            a[i] = a[min];
            a[min] = m;
        }

    }

}
