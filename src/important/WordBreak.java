package important;

import java.util.List;

/**
 * @author tenghaoxiang
 * @date 2019/9/2 下午10:30
 * @Description 分隔单词，例：s = "leetcode", wordDict = ["leet", "code"]， true
 *  s = "applepenapple", wordDict = ["apple", "pen"]， true， 可以重复利用
 */
public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {

        boolean[] res = new boolean[s.length() + 1];
        res[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (res[j] && wordDict.contains(s.substring(j, i))) {
                    res[i] = true;
                    break;
                }
            }
        }
        return res[s.length()];

    }

}
