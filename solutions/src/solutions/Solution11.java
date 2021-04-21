package solutions;

/**
 * @author lvchaoxian
 * @date 2021/4/21 8:09 上午
 */
public class Solution11 {

    public static int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int max = 0;
        while (i < j) {
            int h = Math.min(height[i], height[j]);
            int currentMax = h * (j - i);
            max = Math.max(currentMax, max);
            while (height[i] <= h && i < j) {
                i ++;
            }
            while (height[j] <= h && i < j) {
                j --;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {3, 4};
        System.out.println(maxArea(a));
    }
}
