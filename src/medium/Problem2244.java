package medium;

import java.util.HashMap;

public class Problem2244 {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> level = new HashMap<>();
        for (int i = 0; i < tasks.length; i++) {
            if (!level.containsKey(tasks[i])) {
                level.put(tasks[i], 1);
            } else {
                level.put(tasks[i], level.get(tasks[i]) + 1);
            }
        }//Determine the numbers of difficulty levels
        int result = 0;
        for (Integer value : level.values()) {
            if (value == 1) return -1;
            result += value % 3 == 0 ? value / 3 : value / 3 + 1;
        }
        return result;
    }
}
