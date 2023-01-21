package easy;

import java.util.ArrayList;
import java.util.List;

public class Problem118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> element = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    element.add(1);
                } else {
                    element.add(temp.get(j - 1) + temp.get(j));
                }
            }
            temp = element;
            result.add(element);
        }
        return result;
    }
}
