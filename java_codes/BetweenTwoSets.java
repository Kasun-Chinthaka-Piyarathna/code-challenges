package java_codes;

import java.util.Collections;
import java.util.List;

public class BetweenTwoSets {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        Collections.sort(a);
        Collections.sort(b);
        int maxA = a.get(a.size() - 1);
        int minB = b.get(0);
        int factorCount = 0;

        if (minB < maxA) {
            return 0;
        }

        for (int i = maxA; i <= minB; i++) {
            boolean isFactorOfAllA = true;
            boolean isFactorForAllB = true;

            for (int j = 0; j < a.size(); j++) {
                if (i % a.get(j) != 0) {
                    isFactorOfAllA = false;
                }
            }
            if (isFactorOfAllA) {
                for (int k = 0; k < b.size(); k++) {
                    if (b.get(k) % i != 0) {
                        isFactorForAllB = false;
                    }
                }
            }
            if (isFactorOfAllA && isFactorForAllB) {
                factorCount += 1;
            }

        }
        return factorCount;
    }

}
