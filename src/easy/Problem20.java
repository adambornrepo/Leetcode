package easy;

public class Problem20 {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1 || s.isEmpty()) {
            return false;
        }
        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        }
        return s.isEmpty();
    }
}
