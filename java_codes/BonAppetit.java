package java_codes;

import java.util.List;

public class BonAppetit {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum = 0;
        for (int i = 0; i < bill.size(); i++) {
            if (i != k) {
                sum += bill.get(i);
            }
        }
        if ((sum / 2) == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - (sum / 2));
        }

    }
}
