package important;

/**
 * @author tenghaoxiang
 * @date 2019/8/22 下午9:46
 * @Description 找出数组中的重复数字
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
