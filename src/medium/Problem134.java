package medium;

public class Problem134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int index = 0, tank = 0, moreGas = 0;
        for (int i = 0; i < gas.length; i++) {
            moreGas += gas[i] - cost[i];
            tank += gas[i] - cost[i];
            if (tank < 0) {
                index = i + 1;
                tank = 0;
            }
        }
        return moreGas >= 0 ? index : -1;
    }
}
