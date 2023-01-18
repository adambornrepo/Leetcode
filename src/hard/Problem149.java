package hard;

import java.util.HashMap;

public class Problem149 {
    public int maxPoints(int[][] points) {
        HashMap<Double, Integer> line = new HashMap<>();
        HashMap<Double, Integer> ver = new HashMap<>();
        HashMap<Double, Integer> hor = new HashMap<>();
        int max = 0;
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];
                if (dx == 0) {
                    double x = points[i][0];
                    if (!ver.containsKey(x)) {
                        ver.put(x, 1);
                    } else ver.put(x, ver.get(x) + 1);
                    continue;
                } else if (dy == 0) {
                    double y = points[i][1];
                    if (!hor.containsKey(y)) {
                        hor.put(y, 1);
                    } else hor.put(y, hor.get(y) + 1);
                    continue;
                }
                double slope = dy / (double) dx;
                if (!line.containsKey(slope)) {
                    line.put(slope, 1);
                } else line.put(slope, line.get(slope) + 1);
            }
            for (Integer value : line.values()) {
                max = Math.max(value, max);
            }
            for (Integer value : hor.values()) {
                max = Math.max(value, max);
            }
            for (Integer value : ver.values()) {
                max = Math.max(value, max);
            }
            line.clear();
            ver.clear();
            hor.clear();
        }
        return ++max;
    }
}
