// 说明: 请不要使用除法，且在 O(n) 时间复杂度内完成此题
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int total = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    total *= nums[j];
                }
            }
            result[i] = total;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = new Solution().productExceptSelf(nums);

        for (int num : result) {
            System.out.print(num + ", ");
        }
    }
}
