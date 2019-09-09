package important;

/**
 * @author tenghaoxiang
 * @date 2019/9/9 下午8:00
 * @Description
 */
public class CutRope {

    public int cutRope(int target) {

        if (target < 2) {
            return 0;
        }
        if (target == 2) {
            return 1;
        }
        if (target == 3) {
            return 2;
        }
        int[] res = new int[target + 1];
        res[0] = 1;
        res[1] = 1;
        res[2] = 2;
        res[3] = 3;

        int max = 0;
        for (int i = 4; i <= target; i++) {
            max = 0;
            for (int j = 1; j <= i / 2; j++) {
                int ans = res[j] * res[i - j];
                if (max < ans) {
                    max = ans;
                }
                res[i] = max;
            }
        }
        max = res[target];
        return max;

    }

}
