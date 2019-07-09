package offer;

public class Solution53 {

    public int GetNumberOfK(int [] array , int k) {

        if (array == null || array.length == 0) {
            return 0;
        }
        int first = getFirst(array, 0, array.length - 1, k);
        int end = getLast(array, 0, array.length - 1, k);
        if (first != -1 && end != -1) {
            return end - first + 1;
        }
        return 0;

    }

    public int getFirst(int[] array, int start, int end, int k) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (array[mid] == k) {
            if (mid > 0 && array[mid - 1] != k || mid == 0) {
                return mid;
            } else {
                end = mid - 1;
            }
        } else if (array[mid] < k) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
        return getFirst(array, start, end, k);
    }

    public int getLast(int[] array, int start, int end, int k) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (array[mid] == k) {
            if (mid < array.length - 1 && array[mid + 1] != k || mid == array.length - 1) {
                return mid;
            } else {
                start = mid + 1;
            }
        } else if (array[mid] < k) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
        return getLast(array, start, end, k);
    }

}
