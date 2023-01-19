package medium;

import java.util.Arrays;

public class Problem1833 {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int spent = 0, result = 0;
        for (int i = 0; i < costs.length; i++) {
            if (costs[i] + spent <= coins) {
                spent += costs[i];
                result++;
            } else break;
        }
        return result;
    }
}
