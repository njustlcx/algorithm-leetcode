package solutions;

/**
 * @author lvchaoxian
 * @date 2021/4/22 7:37 上午
 */
public class Solution13 {
    public static int[] arr = new int[256];
    static {
        arr['I'] = 1;
        arr['V'] = 5;
        arr['X'] = 10;
        arr['L'] = 50;
        arr['C'] = 100;
        arr['D'] = 500;
        arr['M'] = 1000;
    }
    public int romanToInt(String s) {
        int sum = 0, lastInt = 0;
        for (int i = s.length() - 1; i >= 0; i --) {
            char c = s.charAt(i);
            int add = arr[c];
            if (add < lastInt) {
                sum -= add;
            } else {
                sum += add;
            }
            lastInt = add;
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
