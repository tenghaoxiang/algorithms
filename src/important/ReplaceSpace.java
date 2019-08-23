package important;

/**
 * @author tenghaoxiang
 * @date 2019/8/23 下午11:11
 * @Description
 */
public class ReplaceSpace {

    public String replaceSpace(StringBuffer str) {

        if (str == null || str.length() == 0) {
            return null;
        }
        int spaceNum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceNum++;
            }
        }
        int oldIndex = str.length() - 1;
        str.setLength(str.length() + spaceNum * 2);
        int newIndex = str.length() - 1;
        while (oldIndex >= 0 && oldIndex < newIndex) {
            if (str.charAt(oldIndex) == ' ') {
                str.setCharAt(newIndex--, '0');
                str.setCharAt(newIndex--, '2');
                str.setCharAt(newIndex--, '%');
            } else {
                str.setCharAt(newIndex--, str.charAt(oldIndex));
            }
            oldIndex--;
        }
        return str.toString();

    }

}
