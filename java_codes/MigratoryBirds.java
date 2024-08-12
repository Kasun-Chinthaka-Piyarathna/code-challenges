package java_codes;

import java.util.List;

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        int[] countArr = new int[] { 0, 0, 0, 0, 0 };
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 1) {
                countArr[0] += 1;
            } else if (arr.get(i) == 2) {
                countArr[1] += 1;
            } else if (arr.get(i) == 3) {
                countArr[2] += 1;
            } else if (arr.get(i) == 4) {
                countArr[3] += 1;
            } else {
                countArr[4] += 1;
            }
        }
        int max = 0;
        int typeNumber = 0;
        for (int j = 0; j < countArr.length; j++) {
            if (countArr[j] > max) {
                max = countArr[j];
                typeNumber = j + 1;
            }
        }
        return typeNumber;

    }

}
