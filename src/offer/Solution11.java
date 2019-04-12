package offer;

public class Solution11 {

    public int minNumberInRotateArray(int [] array) {

        /**
         * 二分法，分为三种情况
         * (1)array[mid] > array[high]:此时最小数字一定在mid的右边。low = mid + 1
         * (2)array[mid] == array[high]:此时最小数字不好判断在mid左边还是右边,high = high - 1
         * (3)array[mid] < array[high]:此时最小数字一定就是array[mid]或者在mid的左边。high = mid
         */
        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (array[mid] > array[high]) {
                low = mid + 1;
            } else if (array[mid] == array[high]) {
                high = high - 1;
            } else {
                high = mid;
            }
        }
        return  array[low];

        /**
         * 自己想的方法，需要比较次数太多，牛客网耗时300ms左右
         */
//        if (array.length == 0) {
//            return 0;
//        }
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < array[i - 1]) {
//                return array[i];
//            }
//        }
//        return array[0];

    }

}
