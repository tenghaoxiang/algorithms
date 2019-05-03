package offer;

public class Solution16 {

    /**
     * 这种方法问题虽然考虑地比较全面，但运算起来比较耗时
     */
//    public double Power(double base, int exponent) {
//
//        if (base == 0) {
//            return 0;
//        }
//        if (exponent == 0) {
//            return 1;
//        }
//        int m = exponent > 0 ? exponent : -exponent;
//        double n = base;
//        for (int i = 1; i < m; i++) {
//            base = base * n;
//        }
//        if (exponent < 0) {
//            base = 1 / base;
//        }
//        return base;
//
//    }

    public double Power(double base, int exponent) {
        if (base == 0) {
            return 0;
        }
        if (exponent == 0) {
            return 1;
        }
        int n = exponent > 0 ? exponent : -exponent;
        double res = 1;
        while (n != 0) {
            if ((n & 1) == 1) {
                res = res * base;
            }
            base *= base;
            n >>= 1;
        }
        return exponent > 0 ? res : (1 / res);
    }

}
