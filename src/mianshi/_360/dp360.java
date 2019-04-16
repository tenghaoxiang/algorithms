package mianshi._360;

import java.util.Scanner;

/**
 * -------2017年360春招--------
 * A、B两伙马贼意外地在一片沙漠中发现了一处金矿，双方都想独占金矿，
 * 但各自的实力都不足以吞下对方，经过谈判后，双方同意用一个公平的方
 * 式来处理这片金矿。处理的规则如下：他们把整个金矿分成n段，由A、B
 * 开始轮流从最左端或最右端占据一段，直到分完为止。马贼A想提前知道
 * 他们能分到多少金子，因此请你帮忙计算他们最后各自拥有多少金子?
 * （两伙马贼均会采取对己方有利的策略）
 */
public class dp360 {

    public static void main(String[] args) {
        dp360 p = new dp360();
        p.solve();
    }

    private void solve() {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            int n = input.nextInt();
            //记录每一段金子的含量
            int[] array = new int[n + 1];
            //记录前n份金子的总价值
            int[] sum = new int[n + 1];
            array[0] = 0;
            sum[0] = 0;
            for (int j = 1; j <= n; j++) {
                array[i] = input.nextInt();
                sum[j] = sum[j - 1] + array[j];
            }
            int[][] f = new int[n + 1][n + 1];
            for (int j = 1; j <= n; j++) {
                f[j][j] = array[j];
            }
            int k = 1;
            while (k <= n - 1) {
                for (int j = 1; j + k <= n; j++) {
                    f[j][j + k] = sum[j + k] - sum[j - 1] - Math.min(f[j][j + k - 1], f[j + 1][j + k]);
                }
                k++;
            }
            System.out.println("Case #"+i+": "+f[1][n]+" "+(sum[n]-f[1][n]));
        }
        input.close();
    }

}
