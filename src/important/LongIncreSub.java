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

}
