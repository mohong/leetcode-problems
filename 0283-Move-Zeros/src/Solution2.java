public class Solution2 {
    public static void moveZeroes(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k++] = nums[i];
            }
        }
        for (int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }
    }


    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        Solution2 solution2 = new Solution2();
        solution2.moveZeroes(nums);
        for (int i : nums) {
            System.out.print(i + ", ");
        }
    }
}
