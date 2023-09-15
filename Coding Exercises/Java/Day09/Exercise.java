package Java.Day09;

public class Exercise {
    public static int countDigits(int number) {
        if (number < 0) {
            number = -number;
        }

        if (number == 0) {
            return 1;
        }

        int count = (int) (Math.floor(Math.log10(number)) + 1);

        return count;
    }
}

