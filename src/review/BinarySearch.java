package review;

/**
 * @author tenghaoxiang
 * @date 2019/8/10 上午9:15
 * @Description
 */
public class BinarySearch <T extends Comparable> {

    public int rank(T[] array, T num){

        if(array == null || array.length == 0){
            return -1;
        }
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(num.compareTo(array[mid]) < 0){
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
