package solutions;

/**
 * @author lvchaoxian
 * @date 2021/4/19 8:15 上午
 */
public class Solution8 {
    public static int myAtoi(String s) {
        long ans = 0;
        // 是否读到第一个非整数非空字符
        boolean checkSign = false;
        int sign = 1;
        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            if (c == ' ' && !checkSign) {
                continue;
            }
            if (!(c - '0' >= 0 && c - '0' <= 9)) {
                if (checkSign) {
                    break;
                }
                if (c == '+' || c == '-') {
                    checkSign = true;
                    if (c == '-') {
                        sign = -1;
                    }
                } else {
                    break;
                }
            }
            if (c - '0' >= 0) {
                checkSign = true;
                ans *= 10;
                ans += (c - '0');
                if (ans * sign > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (ans * sign < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            }
        }
        ans *= sign;
        if (ans > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (ans < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return (int) ans;
        }
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("    -4193 with words"));
    }
}
