package offer;

public class Solution58 {

    public String LeftRotateString(String str,int n) {

        if(str == null || str.length() == 0){
            return str;
        }
        return str.substring(n, str.length()) + str.substring(0, n);

    }

}
