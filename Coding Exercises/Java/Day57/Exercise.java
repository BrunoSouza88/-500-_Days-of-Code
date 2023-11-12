public class Exercise {

    public static int doubleTheValue(int value) {
        return value * 2;
    }

    public static int quadrupleTheValue(int value) {
        int doubledValue = doubleTheValue(value);
        return doubleTheValue(doubledValue);
    }
}
