package Java.Day63;

public class Exercise {

    public static boolean isSelfDividing(int number) {
        if (number == 0) {
            return false;
        }

        String numString = Integer.toString(number);

        for (int i = 0; i < numString.length(); i++) {
            int digit = Character.getNumericValue(numString.charAt(i));

            if (digit == 0 || number % digit != 0) {
                return false;
            }
        }

        return true;
    }
}
