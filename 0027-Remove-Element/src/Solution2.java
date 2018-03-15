public class Solution2 {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                if (i != k) {
                    swap(nums, i, k++);
                } else {
                    k++;
                }
            }
        }
        return  k;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int value = 3;

        Solution2 solution2 = new Solution2();
        System.out.println(solution2.removeElement(nums, value));
    }
}
