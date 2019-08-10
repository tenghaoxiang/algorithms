package review;

/**
 * @author tenghaoxiang
 * @date 2019/8/10 上午9:04
 * @Description
 */
public class TrapWater {

    public int trap(int[] height) {

        if(height == null || height.length == 0){
            return 0;
        }
        int length = height.length;
        int left = 0;
        int right = length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int max = 0;
        while (left <= right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if (left < right) {
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
