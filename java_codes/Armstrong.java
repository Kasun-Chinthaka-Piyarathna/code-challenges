package java_codes;

public class Armstrong {
    public static void main(String[] args) {
        int number = 372;
        if (isArmstrongNumber(number)) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int sum = 0;
        int size = 0;
        int originalNumber = number;
        while (originalNumber > 0) {
            size += 1;
            originalNumber = originalNumber / 10;
        }
        originalNumber = number;
        while (originalNumber > 0) {
            int remainder = originalNumber % 10;
            sum += Math.pow(remainder, size);
            originalNumber = originalNumber / 10;

        }
        return sum == number;
    }

}
