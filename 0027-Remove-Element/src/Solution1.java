public class Solution1 {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return  k;
    }


    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int value = 3;

        Solution1 solution1 = new Solution1();
        System.out.println(solution1.removeElement(nums, value));
    }
}
