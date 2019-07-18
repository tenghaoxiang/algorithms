package offer;

public class Solution3 {

    public boolean duplicate(int numbers[],int length,int [] duplication) {

//        int[] help = new int[length];
//        for (int i = 0; i < length; i++) {
//            if (++help[numbers[i]] == 2) {
//                duplication[0] = numbers[i];
//                return true;
//            }
//        }
//        return false;

        int help;
        for (int i = 0; i < length; i++) {
            if (numbers[i] != i) {
                if (numbers[i] == numbers[numbers[i]]) {
                    duplication[0] = numbers[i];
                    return true;
                } else {
                    help = numbers[numbers[i]];
                    numbers[numbers[i]] = numbers[i];
                    numbers[i] = help;
                }
            }


        }
        return false;

    }

}
