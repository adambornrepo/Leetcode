package easy;

public class Problem69 {
    public int mySqrt(int x) {
        long control = 1;
        do {
            if (control * control >= x) {
                break;
            }
            control++;
        } while (!(control >= x));
        if (control * control == x) {
            return (int) control;
        } else {
            return (int) control - 1;
        }
    }
}
