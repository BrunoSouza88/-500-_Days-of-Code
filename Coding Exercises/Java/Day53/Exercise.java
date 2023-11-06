package Java.Day53;

public class Exercise {
    
    public static int sumOfAllDigits(int num) {
        num = Math.abs(num);

        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        return sum;
    }
}
