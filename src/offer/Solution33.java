package offer;

public class Solution33 {

    public boolean VerifySquenceOfBST(int [] sequence) {

        if (sequence == null || sequence.length == 0) {
            return false;
        }
        return help(sequence, 0, sequence.length - 1);

    }

    public boolean help(int[] nums, int start, int end) {

        if (start >= end) {
            return true;
        }
        int mid = start;
        while (mid < end && nums[mid] < nums[end]) {
            ++mid;
        }
        int next = mid;
        while (next < end && nums[next] > nums[end]) {
            ++next;
        }
        if (next < end) {
            return false;
        }
        return help(nums, start, mid - 1) && help(nums, mid, end - 1);

    }

}
