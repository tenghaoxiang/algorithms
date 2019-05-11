package leetcode;

public class Solution7 {

    public static int reverse(int x) {

        int num = x >= 0 ? x : -x;
        int newRes = 0;
        int res = 0;
        int cur;
        while (num != 0) {
            cur = num % 10;
            newRes = res * 10 + cur;
            if ((newRes - cur) / 10 != res) {
                return 0;
            }
            res = newRes;
            num /= 10;
        }
        return x >= 0 ? res : -res;

    }

}
