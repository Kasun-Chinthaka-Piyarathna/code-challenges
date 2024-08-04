package java_codes;

import java.util.ArrayList;
import java.util.List;

public class BreakFirstAndWorstRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int highestScoreRecord = 0;
        int lowestScoreRecord = 0;
        int maximum = scores.get(0);
        int minimum = scores.get(0);
        List<Integer> records = new ArrayList<>();
        for (int i = 0; i < scores.size(); i++) {
            if (maximum < scores.get(i)) {
                maximum = scores.get(i);
                highestScoreRecord += 1;
            }
            if (minimum > scores.get(i)) {
                minimum = scores.get(i);
                lowestScoreRecord += 1;
            }
        }
        records.add(highestScoreRecord);
        records.add(lowestScoreRecord);
        return records;
    }
}
