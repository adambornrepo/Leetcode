package easy;

public class Problem70 {
    public int climbStairs(int n) {
        int secLastNum = 0;
        int lastNum = 1;
        int result = 0;

        for (int i = 0; i < n; i++) {
            result = lastNum + secLastNum;
            secLastNum = lastNum;
            lastNum = result;
        }
        return result;
    }
}
