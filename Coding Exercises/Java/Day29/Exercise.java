package Java.Day29;

public class Exercise {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        if (principal == 0.0 || rate == 0.0 || time == 0.0) {
            return 0.0;
        }

        double simpleInterest = (principal * rate * time) / 100.0;

        return simpleInterest;
    }
}
