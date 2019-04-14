package offer;

public class Solution10 {

    public int Fibonacci(int n) {

        int a = 0;
        int b = 1;
        if (n <= 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            answer = a + b;
            a = b;
            b = answer;
        }
        return answer;

    }

}
