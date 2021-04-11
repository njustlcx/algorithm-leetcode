package solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lvchaoxian
 * @date 2021/4/9 8:39 上午
 */
public class Solution1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i ++) {
            if (map.containsKey(target - nums[i])) {
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i], i);
        }
        return ans;
    }

    public static void print(int[] a) {
        for (int i: a) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 3};
        print(twoSum(a, 6));
    }
}
