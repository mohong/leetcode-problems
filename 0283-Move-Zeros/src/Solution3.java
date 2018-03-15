public class Solution3 {
    public void moveZeroes(int[] nums) {
        int k = 0;
        // // nums中, [0…k)的元素均为非0元素
        // 遍历到第i个元素后,保证[0...i]中所有非0元素
        // 都按照顺序排列在[0...k)中
        // 同时, [k...i] 为 0
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != k) {
                    swap(nums, i, k++);
                } else {
                    k++;
                }
            }
        }
    }
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        Solution3 solution3 = new Solution3();
        solution3.moveZeroes(nums);
        for (int i : nums) {
            System.out.print(i + ", ");
        }
    }
}
