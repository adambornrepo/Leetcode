package easy;

public class Problem26 {
    public int removeDuplicates(int[] nums) {
        int unique = nums[0];
        int index = 1;
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == unique) {
                continue;
            }else {
                unique = nums[i];
                nums[index] = nums[i];
                k++;
            }
            index++;
        }
        return k;
    }
}
