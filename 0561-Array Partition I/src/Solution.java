import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i+=2) {
            sum += Math.min(nums[i], nums[i+1]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,2};
        System.out.println(new Solution().arrayPairSum(arr));
    }

}
