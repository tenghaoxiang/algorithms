package important;

/**
 * @author tenghaoxiang
 * @date 2019/8/6 下午11:10
 * @Description 希尔排序
 */
public class ShellSort {

    public <T extends Comparable> void sort(T[] array) {

        int length = array.length;
        int h = 1;
        while (h < length / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < length; i++) {
                for (int j = i; j >= h && array[j].compareTo(array[j - h]) < 0; j -= h) {
                    T help = array[j - h];
                    array[j - h] = array[j];
                    array[j] = help;
                }
            }
            h = h / 3;
        }

    }

}
