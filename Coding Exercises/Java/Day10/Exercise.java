package Java.Day10;

public class Exercise {
    public static long nthFibonacci(int n) {
        long[] memo = new long[n + 1];
        
        return fibonacci(n, memo);
    }

    private static long fibonacci(int n, long[] memo) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        if (memo[n] == 0) {
            memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        }

        return memo[n];
    }

    public static void main(String[] args) {
        int n = 0;
        long result = nthFibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }
}
