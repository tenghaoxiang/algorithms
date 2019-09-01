package review;

/**
 * @author tenghaoxiang
 * @date 2019/8/31 下午4:54
 * @Description
 */
public class LongIncrSub {

    public static int lengthOfLIS(int[] nums) {

        if(nums == null || nums.length == 0){
            return 0;
        }
        int[] tails = new int[nums.length];
        int len = 0;
        tails[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < tails[0]) {
                tails[0] = nums[i];
            } else if (nums[i] >= tails[len]) {
                tails[++len] = nums[i];
            } else {
                tails[binarySearch(tails, 0, len, nums[i])] = nums[i];
            }
        }
        return len + 1;

    }

    private static int binarySearch(int[] tails, int min, int max, int target){

        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (tails[mid] == target) {
                return mid;
            } else if (tails[mid] < target) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return min;

    }

}
