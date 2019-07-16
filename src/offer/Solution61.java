package offer;

import java.util.Arrays;

public class Solution61 {

    public boolean isContinuous(int [] numbers) {

        if (numbers == null || numbers.length == 0) {
            return false;
        }
        Arrays.sort(numbers);
        int zero = 0;
        int gap = 0;
        int i = 0;
        for (; i < numbers.length && numbers[i] == 0; i++) {
            zero++;
        }
        for (; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                return false;
            }
            gap = gap + numbers[i + 1] - numbers[i] - 1;
        }
        return zero >= gap;

    }

}
