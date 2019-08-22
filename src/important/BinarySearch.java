package important;

/**
 * @author tenghaoxiang
 * @date 2019/8/9 下午6:39
 * @Description 二分查找
 */
public class BinarySearch <T extends Comparable> {

    //复习
    //数组必须是有序的
    public int rank(T num, T[] array) {

        int low = 0;
        int high = array.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if (num.compareTo(array[mid]) < 0) {
                high = mid - 1;
            } else if (num.compareTo(array[mid]) > 0) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }

}
