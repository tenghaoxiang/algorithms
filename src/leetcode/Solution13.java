package leetcode;

public class Solution13 {

    public int romanToInt(String s) {

        final int length = s.length();
        int i = 0;
        int sum = 0;
        while (i < length) {

            char c1 = s.charAt(i);
            char c2 = ' ';
            if (i < length - 1) {
                c2 = s.charAt(i + 1);
            }
            switch (c1) {
                case 'I':
                    if (c2 == 'V') {
                        sum = sum + 4;
                        i = i + 2;
                    } else if (c2 == 'X') {
                        sum = sum + 9;
                        i = i + 2;
                    } else {
                        sum = sum + 1;
                        i++;
                    }
                    break;
                case 'X':
                    if (c2 == 'L') {
                        sum = sum + 40;
                        i = i + 2;
                    } else if (c2 == 'C') {
                        sum = sum + 90;
                        i = i + 2;
                    } else {
                        sum = sum + 10;
                        i++;
                    }
                    break;
                case 'C':
                    if (c2 == 'D') {
                        sum = sum + 400;
                        i = i + 2;
                    } else if (c2 == 'M') {
                        sum = sum + 900;
                        i = i + 2;
                    } else {
                        sum = sum + 100;
                        i++;
                    }
                    break;
                case 'V':
                    sum = sum + 5;
                    i++;
                    break;
                case 'L':
                    sum = sum + 50;
                    i++;
                    break;
                case 'D':
                    sum = sum + 500;
                    i++;
                    break;
                case 'M':
                    sum = sum + 1000;
                    i++;
                    break;
            }

        }
        return sum;

    }

}
