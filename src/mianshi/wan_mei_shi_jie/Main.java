package mianshi.wan_mei_shi_jie;

import java.util.Scanner;

/**
 * 每个题需要花费的时间和题的分数不同，在有限的时间内，得的最高分是多少
 * 第一行：题目个数
 * 第二行：每道题的分数
 * 第三行：每道题的时间
 * 第四行：总时间
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] fenshu = new int[n];
        int[] shijian = new int[n];
        for (int i = 0; i < n; i++) {
            fenshu[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            shijian[i] = input.nextInt();
        }
        int time = input.nextInt();
        int grade = sum(fenshu, shijian, 0, n, 0, time);
        System.out.println(grade);

    }

    public static int sum(int[] fenshu, int[] shijian, int left, int n, int grade, int time) {
        int init_grade = grade;
        int init_time = time;
        if (left == n) {
            return grade;
        }
        if (time < shijian[left]) {

        } else {
            time = time - shijian[left];
            grade = grade + fenshu[left];
        }
        grade = Math.max(sum(fenshu, shijian, left + 1, n, grade, time), sum(fenshu, shijian, left + 1, n, init_grade, init_time));
        return grade;
    }

}
