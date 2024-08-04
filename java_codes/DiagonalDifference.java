package java_codes;

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftRoRightDiagonal = 0;
        int rightToLeftDiagonal = 0;
        for (int i = 0; i < arr.size(); i++) {
            leftRoRightDiagonal += arr.get(i).get(i);
            rightToLeftDiagonal += arr.get(i).get(arr.size() - i - 1);
        }
        return Math.abs(leftRoRightDiagonal - rightToLeftDiagonal);
    }

}
