package solutions;

/**
 * @author lvchaoxian
 * @date 2021/4/20 8:17 上午
 */
public class Solution9 {

    public static boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        int ans = 0;
        while (x > ans) {
            ans = ans * 10 + x % 10;
            x /= 10;
        }
        return x == ans || x == ans / 10;
    }

    public static boolean isPalindrome2(int x) {
        if (x == 0) return true;
        if (x < 0 || x % 10 == 0) return false;
        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return x == reversed || x == reversed / 10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1001));
        System.out.println(isPalindrome2(1001));
    }
}
