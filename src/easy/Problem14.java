package easy;

import java.util.Arrays;
import java.util.Comparator;

public class Problem14 {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        int prefixLength = 0;

        for (int i = 0; i < strs[0].length(); i++) {
            int counter = 0;
            for (int j = 1; j < strs.length; j++) {
                if (strs[0].charAt(i) == strs[j].charAt(i)) {
                    counter++;
                }
            }
            if (counter == strs.length - 1) {
                prefixLength++;
            } else break;
        }

        String result = "";
        result += strs[0].substring(0, prefixLength);
        return result;
    }
}
