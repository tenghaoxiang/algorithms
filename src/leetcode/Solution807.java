package leetcode;

public class Solution807 {

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        final int n = grid.length;
        int[] col = new int[n], row = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                row[i] = Math.max(row[i], grid[i][j]);
                col[j] = Math.max(col[j], grid[i][j]);
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                res += Math.min(row[i], col[j]) - grid[i][j];
        return res;
    }

/**
 * 我的思路太复杂了，遍历两次才找到行和列的最大值
 */
//    public int maxIncreaseKeepingSkyline(int[][] grid) {
//
//        int total = 0;
//        int[] columnMax = new int[grid.length];
//        for (int i = 0; i < grid[0].length; i++) {
//            int max = grid[0][i];
//            for (int j = 0; j < grid.length; j++) {
//                if (max < grid[j][i]) {
//                    max = grid[j][i];
//                }
//            }
//            columnMax[i] = max;
//        }
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[i].length; j++) {
//                while (grid[i][j] < Math.min(columnMax[j], rowMax(grid[i]))) {
//                    grid[i][j]++;
//                    total++;
//                }
//            }
//        }
//        return total;
//
//    }

//    public int rowMax(int[] num) {
//        int max = num[0];
//        for (int i = 0; i < num.length; i++) {
//            if (max < num[i]) {
//                max = num[i];
//            }
//        }
//        return max;
//    }

}
