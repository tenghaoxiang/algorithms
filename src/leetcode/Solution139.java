package leetcode;

import java.util.List;

public class Solution139 {

    public boolean wordBreak(String s, List<String> wordDict) {

        boolean[] f = new boolean[s.length() + 1];
        f[0] = true;

        /**
         * 动态规划经典思路，一定要理解
         */
//        for(int i = 1; i <= s.length(); i++){
//            for(String str: wordDict){
//                if(str.length() <= i){
//                    if(f[i - str.length()]){
//                        if(s.substring(i-str.length(), i).equals(str)){
//                            f[i] = true;
//                            break;
//                        }
//                    }
//                }
//            }
//        }

        /**
         * 第二章dp方法
         */
        for(int i=1; i <= s.length(); i++){
            for(int j=0; j < i; j++){
                if(f[j] && wordDict.contains(s.substring(j, i))){
                    f[i] = true;
                    break;
                }
            }
        }

        return f[s.length()];

    }

}
