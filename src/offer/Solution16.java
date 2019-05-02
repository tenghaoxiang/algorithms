package offer;

public class Solution16 {

    public double Power(double base, int exponent) {

        if (base == 0) {
            return 0;
        }
        if (exponent == 0) {
            return 1;
        }
        int m = exponent > 0 ? exponent : -exponent;
        double n = base;
        for (int i = 1; i < m; i++) {
            base = base * n;
        }
        if (exponent < 0) {
            base = 1 / base;
        }
        return base;

    }

}
