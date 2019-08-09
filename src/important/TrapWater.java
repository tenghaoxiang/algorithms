package important;

/**
 * @author tenghaoxiang
 * @date 2019/8/9 下午1:46
 * @Description 收集雨水，LeetCode42题
 */
public class TrapWater {

    public int trap(int[] height) {

        int max = 0;
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        while(left <= right){
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if (leftMax < rightMax) {
                max = max + (leftMax - height[left]);
                left++;
            } else {
                max = max + (rightMax - height[right]);
                right--;
            }
        }
        return max;

    }

}
