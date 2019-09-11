package important;

/**
 * @author tenghaoxiang
 * @date 2019/9/11 下午8:50
 * @Description
 */
public class ReserveString {

    public void reserve(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.setCharAt(1,'1');
    }

}
