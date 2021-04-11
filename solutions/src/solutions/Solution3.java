package solutions;

import java.util.Arrays;

/**
 * @author lvchaoxian
 * @date 2021/4/11 3:35 下午
 */
public class Solution3 {
    /**
     * 动态规划解法
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int ans = 1;
        int[] record = new int[256];
        Arrays.fill(record, -1);
        record[s.charAt(0)] = 0;
        int[] dp = new int[s.length()];
        dp[0] = 1;
        for (int i = 1; i < s.length(); i ++) {
            int c = s.charAt(i);
            if (record[c] != -1) {
                dp[i] = Math.min(dp[i - 1] + 1, i - record[c]);
            } else {
                dp[i] = dp[i - 1] + 1;
            }
            record[c] = i;
            if (dp[i] > ans) {
                ans = dp[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "aabaab!bb";
        System.out.println(lengthOfLongestSubstring("bbbb"));
    }
}
