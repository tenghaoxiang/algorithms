package leetcode;

/**
 * 将字符串全部变为小写
 */
public class Solution709 {

    public String toLowerCase(String str) {
        return str.toLowerCase();
    }

//    public String toLowerCase(String str) {
//        char[] a = str.toCharArray();
//        for (int i = 0; i < a.length; i++)
//            if ('A' <= a[i] && a[i] <= 'Z')
//                a[i] = (char) (a[i] - 'A' + 'a');
//        return new String(a);
//    }

}
