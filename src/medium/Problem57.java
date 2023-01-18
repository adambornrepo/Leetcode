package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Problem57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> resultList = new ArrayList<>();
        int start = newInterval[0], end = newInterval[1];
        boolean flag = true;
        for (int i = 0; i < intervals.length; i++) {
            int sec = intervals[i][1];
            int first = intervals[i][0];
            if (!(sec >= newInterval[0] && first <= newInterval[1])) {
                resultList.add(intervals[i]);
            } else {
                if (sec >= newInterval[0] && flag) {
                    start = Math.min(intervals[i][0], newInterval[0]);
                    flag = false;
                }
                if (first <= newInterval[1]) {
                    end = Math.max(intervals[i][1], newInterval[1]);
                }
            }
        }
        resultList.add(new int[]{start, end});
        int[][] result = new int[resultList.size()][2];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        Arrays.sort(result, Comparator.comparingInt(e -> e[0]));
        return result;
    }
}
