package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Solution38 {

    public ArrayList<String> Permutation(String str) {

        ArrayList<String> list = new ArrayList<>();
        if (str.length() > 0 && str != null) {
            Permutation(str.toCharArray(), 0, list);
            Collections.sort(list);
        }
        return list;

    }

    /**
     * 递归算法
     */
    private void Permutation(char[] chars, int left, ArrayList<String> list) {
        if (left == chars.length - 1) {
            list.add(String.valueOf(chars));
        } else {
            Set<Character> set = new HashSet<>();
            for (int i = left; i < chars.length; i++) {
                if (i == left || !set.contains(chars[i])) {
                    /**
                     * 将left后边的元素加入set集合，若有重复的元素，则忽略
                     */
                    set.add(chars[i]);
                    /**
                     * 将i以及其后边的所有满足条件的字符与left位置的字符交换
                     */
                    swap(chars, left, i);
                    /**
                     * 将left加一，对剩下的部分进行递归
                     */
                    Permutation(chars, left + 1, list);
                    swap(chars, i, left);
                }
            }
        }
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

}
