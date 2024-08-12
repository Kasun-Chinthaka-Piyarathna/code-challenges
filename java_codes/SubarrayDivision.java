package java_codes;

import java.util.List;

public class SubarrayDivision {

    public static int birthday(List<Integer> s, int d, int m) {
        int numberOfWays = 0;
        for (int i = 0; i < s.size(); i++) {
            int sum = 0;
            if ((i + m) <= s.size()) {
                for (int j = i; j < i + m; j++) {
                    sum += s.get(j);
                }
                if (d == sum) {
                    numberOfWays += 1;
                }
            }
        }
        return numberOfWays;

    }
}
