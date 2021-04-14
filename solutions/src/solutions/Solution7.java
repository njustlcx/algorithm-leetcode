package solutions;

/**
 * @author lvchaoxian
 * @date 2021/4/14 7:43 上午
 */
public class Solution7 {

    public static int reverse(int x) {
        int multiply = x >= 0 ? 1: -1;
        int y = x > 0? x: -x;
        long ans = 0;
        while (y > 0) {
            ans *= 10;
            int t = y % 10;
            ans += t;
            y /= 10;
        }
        ans *= multiply;
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        System.out.println(reverse(0));
    }
}
