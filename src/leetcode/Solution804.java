package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution804 {

    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = new String[]{".-","-...","-.-.","-..",".",
                "..-.","--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",".--",
                "-..-","-.--","--.."};
        Set set = new HashSet();
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            stringBuilder.setLength(0);
            int length = word.length();
            for (int i = 0; i < length; i++) {
                stringBuilder.append(morse[word.charAt(i)-'a']);
            }
            set.add(stringBuilder.toString());
        }
        return set.size();
    }

}
