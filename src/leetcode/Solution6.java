package leetcode;

public class Solution6 {
    public String convert(String s, int nRows) {
        if (s == null) {
            return null;
        }
        StringBuffer[] stringBuffer = new StringBuffer[nRows];
        for (int i = 0; i < nRows; i++) {
            stringBuffer[i] = new StringBuffer();
        }
        int i= 0;
        while (i < s.length()) {
            for (int idx = 0; idx < nRows && i < s.length(); idx++) {
                stringBuffer[idx].append(s.charAt(i++));
            }
            for (int idx = nRows - 2; idx >= 1 && i < s.length(); idx--) {
                stringBuffer[idx].append(s.charAt(i++));
            }
        }
        for (int j = 1; j < nRows; j++) {
            stringBuffer[0].append(stringBuffer[j]);
        }
        return stringBuffer[0].toString();
    }
}
