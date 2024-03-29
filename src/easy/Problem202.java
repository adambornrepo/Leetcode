package easy;

public class Problem202 {
    public boolean isHappy(int n) {
        int sum = 0;
        do {
            sum = 0;
            while (n > 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            if (sum==7) return true;
            n = sum;
        } while (sum != 1 && sum / 10 != 0);
        boolean result = sum == 1;
        return result;
    }
}
