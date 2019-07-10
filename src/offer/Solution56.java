package offer;

public class Solution56 {

    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {

        if (array == null || array.length < 2) {
            return;
        }

        int num = 0;
        for (int i = 0; i < array.length; i++) {
            num = array[i] ^ num;
        }
        int n = num ^ (num & (num - 1));
        int index = 0;
        while (n != 0) {
            n = n >> 1;
            index++;
        }
        for (int i = 0; i < array.length; i++) {
            int k = array[i] >> (index - 1);
            if ((k & 1) == 0) {
                num1[0] = num1[0] ^ array[i];
            } else {
                num2[0] = num2[0] ^ array[i];
            }
        }

    }

}
