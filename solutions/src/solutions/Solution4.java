package solutions;

/**
 * @author lvchaoxian
 * @date 2021/4/13 6:53 上午
 */
public class Solution4 {
    /**
     * O(m + n)解法
     * @param nums1
     * @param nums2
     * @return
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalNum = nums1.length + nums2.length;
        int mid = totalNum / 2;
        int[] newArr = new int[mid + 1];
        int i = 0, j = 0, m = 0;
        while (i + j <= mid) {
            if (i < nums1.length && j < nums2.length) {
                newArr[m ++] = nums1[i] >= nums2[j] ? nums2[j ++]: nums1[i ++];
            } else if (j < nums2.length) {
                newArr[m ++] = nums2[j ++];
            } else if (i < nums1.length) {
                newArr[m ++] = nums1[i ++];
            }
        }
        double res = 0;
        if (totalNum % 2 == 0) {
            res = (newArr[mid] + newArr[mid - 1]) * 1.0 / 2;
        } else {
            res = newArr[mid];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double res = findMedianSortedArrays(nums1, nums2);
        System.out.println(res);
    }
}
