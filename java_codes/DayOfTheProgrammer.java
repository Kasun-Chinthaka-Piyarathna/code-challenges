package java_codes;

public class DayOfTheProgrammer {

    public static String dayOfProgrammer(int year) {
        String dayOftheProgrammer = null;
        if (year < 1918) {
            // julien calender
            if (year % 4 == 0) {
                int gap = 256 - 244;
                dayOftheProgrammer = String.format("%02d.09.%d", gap, year);
            } else {
                int gap = 256 - 243;
                dayOftheProgrammer = String.format("%02d.09.%d", gap, year);
            }
        } else if (year >= 1919) {
            // Gregorian Claneder
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 > 0)) {
                int gap = 256 - 244;
                dayOftheProgrammer = String.format("%02d.09.%d", gap, year);

            } else {
                int gap = 256 - 243;
                dayOftheProgrammer = String.format("%02d.09.%d", gap, year);
            }
        } else {
            int gap = 256 - (243 - 13);
            dayOftheProgrammer = String.format("%02d.09.%d", gap, year);
        }
        return dayOftheProgrammer;
    }

}
