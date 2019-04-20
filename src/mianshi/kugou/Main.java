package mianshi.kugou;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 输入一个数组，能否将其分为两个和相等的子数组(两个子数组的大小可以不相等)
 * 根据0-1背包问题进行求解，因为value和weight的长度为n，所以需要用i-1来对应dp数组中的i
 * 若想记录取走了哪几个元素，可倒序进行遍历获取
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final int length = input.nextInt();
        int[] value = new int[length];
        int[] weight = new int[length];
        int sum = 0;
        for (int i = 0; i < length; i++) {
            int num = input.nextInt();
            value[i] = num;
            weight[i] = num;
            sum += num;
        }
        input.close();
        if (sum % 2 != 0) {
            System.out.println("false");
        } else {
            System.out.println(divide(value, weight, length, sum / 2) == sum / 2);
        }



    }

    public static int divide(int[] nums, int[] weight, int length, int target) {

        List<Integer> list = new ArrayList<>();
        int[][] dp = new int[length + 1][target + 1];
        for (int i = 0; i <= length; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <=target; i++) {
            dp[0][i] = 0;
        }
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= target; j++) {
                if (weight[i-1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j - weight[i - 1]] + nums[i - 1], dp[i - 1][j]);
                }
            }
        }
        int m = length, n = target;
        while (m >= 1 && n >= 1) {
            if (dp[m - 1][n - weight[m - 1]] + nums[m - 1] > dp[m - 1][n]) {
                list.add(m - 1);
                n = n - weight[m - 1];
                m = m - 1;
            } else {
                m = m - 1;
            }
        }
        for (Integer i : list) {
            System.out.print(i+" ");
        }
        return dp[length][target];

    }

}
