package leetcode;

public class Solution43 {

    /**
     * 这道题我是没有思路的，给定两个数字字符串，算出相乘的结果
     * 由于长度太长，无法使用int类型直接求解，所以陷入困境，大佬
     * 充分利用了乘法位置的信息得出结果
     * num1[i] * num2[j] will be placed at indices [i + j, i + j + 1]
     */
    public String multiply(String num1, String num2) {

        final int length1 = num1.length();
        final int length2 = num2.length();
        int[] pos = new int[length1 + length2];
        for (int i = length2 - 1; i >= 0; i--) {
            for (int j = length1 - 1; j >= 0; j--) {
                int mul = (num2.charAt(i) - '0') * (num1.charAt(j) - '0');
                int p1 = i + j;
                int p2 = i + j + 1;
                mul = mul + pos[p2];
                pos[p1] = pos[p1] + mul / 10;
                pos[p2] = mul % 10;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int p : pos) {
            if (!(stringBuilder.length() == 0 && p == 0)) {
                stringBuilder.append(p);
            }
        }
        return stringBuilder.length() == 0 ? "0" : stringBuilder.toString();
    }

}
