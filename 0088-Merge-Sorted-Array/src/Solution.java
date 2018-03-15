import java.util.Arrays;

// 归并的思路
public class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = Arrays.copyOf(nums1, m);
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < m + n; i++) {
            if (index1 >= m) {
                nums1[i] = nums2[index2];
                index2++;
            } else if (index2 >= n ) {
                nums1[i] = temp[index1];
                index1++;
            } else if (temp[index1] < nums2[index2]) {
                nums1[i] = temp[index1];
                index1++;
            } else {
                nums1[i] = nums2[index2];
                index2++;
            }
        }
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int m = 3;
        int[] nums2 = {7, 8};
        int n = 2;

        merge(nums1, m, nums2, n);

        for (int num : nums1) {
            System.out.print(num + ", ");
        }
    }
}


