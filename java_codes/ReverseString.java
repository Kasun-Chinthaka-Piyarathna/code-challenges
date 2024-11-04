package java_codes;

public class ReverseString {
    public static void main(String[] args) {
        String inputStr = "Robert";
        char[] charArr = inputStr.toCharArray();  
        for (int i = 0, j = charArr.length - 1; i < j; i++, j--) {
            char temp = charArr[j];
            charArr[j] = charArr[i];
            charArr[i] = temp;
        }
        for (int i = 0; i < charArr.length; i++) {
            System.out.print(charArr[i]);
        }

    }
}