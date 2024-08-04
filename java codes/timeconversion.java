/*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

public static String timeConversion(String s) {
    String[] gaps = s.split(":");
    if (gaps[2].contains("AM")) {
        if (gaps[0].equals("12")) {
            gaps[0] = "00";
        }
    }
    if (gaps[2].contains("PM")) {
        if (gaps[0].equals("12")) {
            gaps[0] = "12";
        } else {
            gaps[0] = String.valueOf(Integer.valueOf(gaps[0]) + 12);
        }
    }
    String twentyfourhourTimeStr = String.format("%02d:%s:%s", Integer.parseInt(gaps[0]), gaps[1],
            gaps[2].substring(0, 2));
    return twentyfourhourTimeStr;
}