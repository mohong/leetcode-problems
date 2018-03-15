public class Solution1 {
    public void moveZeroes(int[] nums) {
        int[] arr = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                arr[k++] = nums[i];
            }
        }
        for (int i = 0; i < k; i++) {
            nums[i] = arr[i];
        }
        for (int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        Solution1 solution1 = new Solution1();
        solution1.moveZeroes(nums);
        for (int i : nums) {
            System.out.print(i + ", ");
        }
    }
}
