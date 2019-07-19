package offer;

public class Solution19 {

    public boolean match(char[] str, char[] pattern) {

        if (str == null || pattern == null) {
            return false;
        }
        int strIndex = 0;
        int patternIndex = 0;
        return help(str, pattern, strIndex, patternIndex);

    }

    public boolean help(char[] str, char[] pattern, int strIndex, int patternIndex) {

        if (strIndex == str.length && patternIndex == pattern.length) {
            return true;
        }
        if (strIndex != str.length && patternIndex == pattern.length) {
            return false;
        }
        if (patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*') {
            if ((strIndex != str.length && pattern[patternIndex] == str[strIndex])
                    || (strIndex != str.length && pattern[patternIndex] == '.')) {
                return help(str, pattern, strIndex, patternIndex + 2)
                        || help(str, pattern, strIndex + 1, patternIndex + 2)
                        || help(str, pattern, strIndex + 1, patternIndex);
            } else {
                return help(str, pattern, strIndex, patternIndex + 2);
            }
        }
        if((strIndex != str.length && pattern[patternIndex] ==  str[strIndex]) || (strIndex != str.length && pattern[patternIndex] == '.')){
            return help(str, pattern, strIndex + 1, patternIndex + 1);
        }
        return false;

    }

}
