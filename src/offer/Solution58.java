package offer;

public class Solution58 {

    public String LeftRotateString(String str,int n) {

        if(str == null || str.length() == 0){
            return str;
        }
        return str.substring(n, str.length()) + str.substring(0, n);

    }

    public String ReverseSentence(String str) {

        if (str == null || str.length() == 0) {
            return str;
        }
        char[] chars = str.toCharArray();
        reverse(chars, 0, chars.length - 1);
        int now = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                reverse(chars, now, i - 1);
                now = i + 1;
            }
        }
        reverse(chars, now, chars.length - 1);
        return new String(chars);

    }

    public void reverse(char[] chars, int begin, int end) {
        while (begin < end) {
            char c = chars[begin];
            chars[begin] = chars[end];
            chars[end] = c;
            begin++;
            end--;
        }
    }

}
