public class Exercise {

    public static double power(double base, int exponent) {
        if (base == 0 && exponent < 0) {
            throw new IllegalArgumentException("Base cannot be 0 when the exponent is negative.");
        }

        if (exponent >= 0) {
            return Math.pow(base, exponent);
        } else {

            double result = 1.0;
            for (int i = 0; i < Math.abs(exponent); i++) {
                result /= base;
            }
            return result;
        }
    }

    public static void main(String[] args) {

        System.out.println(power(2.0, 3));
        System.out.println(power(3.0, 2));
        System.out.println(power(5.0, 0));
        System.out.println(power(2.0, -2));
    }
}
