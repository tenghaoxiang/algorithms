package review;

/**
 * @author tenghaoxiang
 * @date 2019/8/23 上午10:02
 * @Description
 */
public class Duplicate {

    int help;
    public boolean duplicate(int numbers[],int length,int [] duplication) {

        for (int i = 0; i < numbers.length; i++) {
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
