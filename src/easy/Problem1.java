package easy;

public class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if ((nums[i] + nums[j] == target) && (i != j)){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
