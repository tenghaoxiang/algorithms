package review;

/**
 * @author tenghaoxiang
 * @date 2019/8/7 上午9:14
 * @Description
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
                    T help = array[j];
                    array[j] = array[j - h];
                    array[j - h] = help;
                }
            }
            h = h / 3;
        }

    }

}
