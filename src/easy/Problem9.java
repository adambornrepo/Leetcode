package easy;

public class Problem9 {
    public boolean isPalindrome(int x) {
        long reverse = 0;
        int num = x;
        if (x < 0) return false;
        while (num > 0) {
            reverse = (reverse * 10) + num % 10;
            num /= 10;
        }
        return reverse == x;
    }
}
