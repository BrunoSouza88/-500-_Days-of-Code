package Java.Day50;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Exercise {
    public static List<Integer> findFactors(int num) {
        List<Integer> factors = new ArrayList<>();

        if (num <= 0) {
            return factors;
        }

        int limit = (int) Math.sqrt(num);
        
        for (int i = 1; i <= limit; i++) {
            if (num % i == 0) {
                factors.add(i);
                if (i != num / i) {
                    factors.add(num / i);
                }
            }
        }

        Collections.sort(factors);

        return factors;
    }
}
