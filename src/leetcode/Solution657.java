package leetcode;

public class Solution657 {

    public boolean judgeCircle(String moves) {
        int horizontal = 0; //水平
        int vertical = 0; //垂直
        final int length = moves.length();
        for (int i = 0; i < length; i++) {
            if (moves.charAt(i) == 'U') {
                vertical++;
            } else if (moves.charAt(i) == 'D') {
                vertical--;
            } else if (moves.charAt(i) == 'R') {
                horizontal++;
            } else {
                horizontal--;
            }
//            switch (moves.charAt(i)) {
//                case 'U':
//                    vertical++;
//                    break;
//                case 'D':
//                    vertical--;
//                    break;
//                case 'R':
//                    horizontal++;
//                    break;
//                case 'L':
//                    horizontal--;
//                    break;
//            }
        }
        if (horizontal == 0 && vertical == 0) {
            return true;
        }
        return false;
    }

}
