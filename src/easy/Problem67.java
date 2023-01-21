package easy;

import java.math.BigInteger;

public class Problem67 {
    public String addBinary(String a, String b) {
        BigInteger a10 = new BigInteger(a,2);
        BigInteger b10 = new BigInteger(b,2);
        BigInteger sum = a10.add(b10);
        String result = sum.toString(2);
        return result;
    }
}
