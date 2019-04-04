package leetcode;

public class Solution942 {

    public int[] diStringMatch(String S) {
        final int length = S.length();
        int[] a = new int[length + 1];
        int head = 0;
        int tail = length;
        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == 'I') {
                a[i] = head++;
            } else {
                a[i] = tail--;
            }
        }
        a[length] = head;
        return a;
    }

}
