package leetcode;

public class Solution1013 {

    public boolean canThreePartsEqualSum(int[] A) {

        int sum = 0;
        int part = 0;
        int count = 0;
        for (int num : A) {
            sum += num;
        }
        if (sum % 3 != 0) {
            return false;
        }
        for (int num : A) {
            part += num;
            if (part != sum / 3) {
                continue;
            }
            if (++count == 3) {
                return true;
            }
            part = 0;
        }
        return false;

    }

}
