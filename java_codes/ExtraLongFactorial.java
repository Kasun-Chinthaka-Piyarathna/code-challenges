package java_codes;

import java.math.BigInteger;

public class ExtraLongFactorial {
    public static void extraLongFactorials(int n) {
        BigInteger bigInteger = factorial(n);
        System.out.print(bigInteger);
    }

    public static BigInteger factorial(int n) {
        BigInteger bigInteger = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }
        return bigInteger;
    }
}
