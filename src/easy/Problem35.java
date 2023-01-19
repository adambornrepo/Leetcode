package easy;

import java.util.Arrays;

public class Problem35 {
    public int searchInsert(int[] nums, int target) {
        int check = Arrays.binarySearch(nums, target);
        if (check>=0) return check;
        return Math.abs(check) - 1;
    }
}
