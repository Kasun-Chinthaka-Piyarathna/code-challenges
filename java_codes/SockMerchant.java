import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SockMerchant {

    public static int sockMerchant(int n, List<Integer> ar) {
        List<Integer> ar2 = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < ar.size(); i++) {
            if (!set.contains(ar.get(i))) {
                int count = 0;
                for (int j = 0; j < ar.size(); j++) {
                    if (ar.get(j) == ar.get(i)) {
                        count += 1;
                    }
                }
                set.add(ar.get(i));
                ar2.add(count);
            }
        }
        int numberOfPairs = 0;
        for (int k = 0; k < ar2.size(); k++) {
            numberOfPairs += (ar2.get(k) / 2);
        }
        return numberOfPairs;

    }
}