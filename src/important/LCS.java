package important;

/**
 * @author tenghaoxiang
 * @date 2019/8/4 下午6:34
 * @Description 最长公共子序列，可以是数组或字符串
 */
public class LCS {

    /**
     * 子序列可以不连续，如ABCD和EACB返回长度为2，因为AC
     *
     * @param s1
     * @param s2
     * @return
     */
    public static int length(String s1, String s2) {

        if (s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty()) {
            return 0;
        }
        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();
        int length1 = array1.length;
        int length2 = array2.length;
        int[][] dp = new int[length1 + 1][length2 + 1];
        for (int i = 1; i <= length1; i++) {
            for (int j = 1; j <= length2; j++) {
                if (array1[i - 1] == array2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[length1][length2];

    }

    /**
     * 要求连续
     *
     * @param A
     * @param B
     * @return
     */
    public static int findLength(int[] A, int[] B) {

        int max = 0;
        if (A == null || A.length == 0 || B == null || B.length == 0) {
            return max;
        }
        int m = A.length;
        int n = B.length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (A[i - 1] == B[j - 1]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println(length("ABCD", "EACB")); //输出为2
        int[] A = new int[]{1, 2, 3, 4};
        int[] B = new int[]{5, 1, 3, 2};
        System.out.println(findLength(A, B)); //输出为1
    }

}
