package offer;

public class Solution5 {

    public String replaceSpace(StringBuffer str) {

        /**
         * 系统方法，不要使用
         * replace和replaceAll的区别，replace根据字符串替换全部符合条件的
         * replaceAll根据正则表达式替换
         */
//        if (str == null || str.length() == 0) {
//            return str.toString();
//        }
//        return str.toString().replace(" ", "%20");

        /**
         * 先遍历一次字符串，这样就能统计出字符串中空格的总数，并由此计算出
         * 替换之后的字符串的总长度。
         */

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
