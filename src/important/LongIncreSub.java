package important;

/**
 * @author tenghaoxiang
 * @date 2019/8/30 下午4:41
 * @Description 面试必备题(最长上升序列)--给出一个没有排序的数组，找出最长的递增子串，可以不连续
 * leetcode300，https://segmentfault.com/a/1190000003819886
 */
public class LongIncreSub {

    public static int lengthOfLIS(int[] nums) {

        int[] tails = new int[nums.length];
        int size = 0;
        for(int x : nums){
            int i = 0, j = size;
            while (i != j) {
                int m = (i + j) / 2;
                if (tails[m] < x) {
                    i = m + 1;
                } else {
                    j = m;
                }
            }
            tails[i] = x;
            if (i == size) {
                ++size;
            }
        }
        return size;

    }

    public static void main(String[] args) {

        int[] nums = {1,2,1,2,5,6,3,7,8};
        System.out.println(lengthOfLIS(nums));

    }

    //道理相同，但这种写法更容易理解
    public int longestIncreasingSubsequence(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        //len表示当前最长的升序序列长度
        int len = 0;
        //tails[i]表示长度为i的升序序列其末尾的数字
        int[] tails = new int[nums.length];
        tails[0] = nums[0];
        //根据三种情况更新不同升序序列的集合
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < tails[0]){
                tails[0] = nums[i];
            } else if (nums[i] >= tails[len]) {
                tails[++len] = nums[i];
            } else {
                // 如果在中间，则二分搜索
                tails[binarySearch(tails, 0, len, nums[i])] = nums[i];
            }
        }
        return len + 1;
    }

    private int binarySearch(int[] tails, int min, int max, int target){

        while(min <= max){
            int mid = min + (max - min) / 2;
            if(tails[mid] == target){
                return mid;
            }
            if(tails[mid] < target){
                min = mid + 1;
            }
            if(tails[mid] > target){
                max = mid - 1;
            }
        }
        return min;

    }

}
