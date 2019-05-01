package leetcode;

public class Solution33 {

    public int search(int[] nums, int target) {

        if (nums == null || nums.length == 0) {
            return -1;
        }
        int minIndex = findMinIndex(nums);
        if (target == nums[minIndex]) {
            return minIndex;
        }
        final int length = nums.length;
        int lo = (target <= nums[length - 1]) ? minIndex : 0;
        int hi = (target > nums[length - 1]) ? minIndex : length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;

    }

    public int findMinIndex(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > nums[hi]) {
                lo = mid + 1;
            } else {
                /**
                 * 此处为什么等于mid而不是mid-1?
                 * 因为mid下标本身的值小于等于hi的值，所以mid指向的可能就是最小值。
                 */
                hi = mid;
            }
        }
        return lo;
    }

}
