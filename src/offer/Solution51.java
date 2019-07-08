package offer;

public class Solution51 {

    public int InversePairs(int [] array) {

        if (array == null || array.length == 0) {
            return 0;
        }
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return helper(array, copy, 0, array.length - 1);

    }

    public int helper(int[] array, int[] copy, int start, int end) {

        if (end <= start) {
            return 0;
        }
        int length = (end - start) / 2;
        int left = helper(array, copy, start, start + length) %1000000007;
        int right = helper(array, copy, start + length + 1, end) %1000000007;
        int i = start + length;
        int j = end;
        int indexCopy = end;
        int count = 0;
        while (i >= start && j >= start + length + 1) {
            if (copy[i] > copy[j]) {
                array[indexCopy--] = copy[i--];
                count = count + j - start - length;
            } else {
                array[indexCopy--] = copy[j--];
            }
        }
        for (; i >= start; i--) {
            array[indexCopy--] = copy[i];
        }
        for (; j >= start + length + 1; j--) {
            array[indexCopy--] = copy[j];
        }
        for (int k = start; k <= end; k++) {
            copy[k] = array[k];
        }
        return (left + right + count) %1000000007;

    }

}
