public class Solution2 {
    public static int findKthLargest(int nums[], int k) {
        return solve(nums, 0, nums.length - 1, k - 1);
    }
    // 对arr[l, r]部分进行partition操作
    private static int partition(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }
        // 随机交换位置
        swap(arr, l, (int)(Math.random() * (r - l + 1) + l));

        int v = arr[l];
        int j = l;
        for (int i = l + 1; i <= r; i++) {
            if (arr[i] > v) {
                j++;
                swap(arr, j, i);
            }
        }
        swap(arr, l, j);
        return j;
    }
    // 求出nums[l...r]范围里第k大的数
    private static int solve(int nums[], int l, int r, int k) {
        if (l == r) {
            return nums[l];
        }
        int p = partition(nums, l, r);
        if (k == p) {
            return nums[p];
        } else if (k < p) {
            return solve(nums, l, p - 1, k);
        } else {
            return solve(nums, p + 1, r, k);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(findKthLargest(nums, k));
    }
}
