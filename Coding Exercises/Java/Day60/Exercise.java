package Java.Day60;

public class Exercise {

    public static int reverseNumber(int num) {
        int reversedNum = 0;

        int sign = (num >= 0) ? 1 : -1;

        num = Math.abs(num);

        while (num != 0) {
            int lastDigit = num % 10;

            reversedNum = reversedNum * 10 + lastDigit;

            num = num / 10;
        }

        reversedNum *= sign;

        return reversedNum;
    }
}
