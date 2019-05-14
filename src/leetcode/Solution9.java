package leetcode;

public class Solution9 {

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }
        int num = 0, n =x;
        while (n != 0) {
            num = num * 10 + n % 10;
            n = n / 10;
        }
        return num == x;

    }

}
