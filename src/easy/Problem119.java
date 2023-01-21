package easy;

import java.util.LinkedList;
import java.util.List;

public class Problem119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = null;
        List<Integer> result = new LinkedList<>();
        int row = rowIndex + 2;
        for (int i = 1; i < row; i++) {
            list = new LinkedList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    list.add(1);
                    continue;
                }
                list.add(result.get(j) + result.get(j - 1));
            }
            result = list;
        }
        return result;
    }
}
