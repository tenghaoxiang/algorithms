package exerciese;

/**
 * @author tenghaoxiang
 * @date 2019/8/2 下午4:36
 * @Description
 */
public class Sort {

    /**
     * 快速排序
     */
//    public <T extends Comparable> void sort(T[] array) {
//        sort(array, 0, array.length - 1);
//    }
//
//    public <T extends Comparable> void sort(T[] array, int left, int right) {
//        if (left >= right) {
//            return;
//        }
//        int index = partition(array, left, right);
//        sort(array, left, index - 1);
//        sort(array, index + 1, right);
//    }
//
//    public <T extends Comparable> int partition(T[] array, int left, int right) {
//
//        T num = array[left];
//        int i = left;
//        int j = right + 1;
//        while (true) {
//            while (array[++i].compareTo(num) < 0) {
//                if (i >= right) {
//                    break;
//                }
//            }
//            while (array[--j].compareTo(num) > 0) {
//
//            }
//            if (i >= j) {
//                break;
//            }
//            T help = array[i];
//            array[i] = array[j];
//            array[j] = help;
//        }
//        array[left] = array[j];
//        array[j] = num;
//        return j;
//
//    }

    /**
     * 堆排序
     */
    int length;

    public <T extends Comparable> void sort(T[] array) {
        length = array.length;
        for (int i = length / 2; i >= 0; i--) {
            sink(array, i);
        }
        while (length > 0) {
            T help = array[--length];
            array[length] = array[0];
            array[0] = help;
            sink(array, 0);
        }
    }

    public <T extends Comparable> void sink(T[] array, int i) {
        while (2 * i + 1 < length) {
            int j = 2 * i + 1;
            if (j < length - 1 && array[j].compareTo(array[j + 1]) < 0) {
                j = j + 1;
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

        T[] array = (T[]) new Comparable[]{23,349,234,0,21,9,-23,2,-34,2123};
        Sort sort = new Sort();
        sort.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

}
