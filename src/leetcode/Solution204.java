package leetcode;

public class Solution204 {

    public int countPrimes(int n) {

        int count = 0;
        boolean[] notPrime = new boolean[n];
        notPrime[0] = true;
        notPrime[1] = true;
        for (int i = 2; i < n; i++) {
            if (!notPrime[i]) {
                count++;
                for (int j = 2; j * i < n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }
        return count;

    }


}
