import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets {
    static int getTotalX(int[] a, int[] b) {
        // Complete this function

        // get LCM on the lower limit array
        int lowerLCM = lcm(a);
        // get GCD on the upper limit array
        int upperGCD = gcd(b);

        List<Integer> between = new ArrayList<>();

        // iterate integers starting from LCM until GCD in LCM increments
        for (int i = lowerLCM; i <= upperGCD; i += lowerLCM) {
            if (upperGCD % i == 0) {
                between.add(i);
            }

        }
        return between.size();

    }

    private static int lcm(int[] input) {
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            result = lcm(result, input[i]);
        }

        return result;
    }

    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    private static int gcd(int a, int b) {
        while (b > 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    private static int gcd(int[] input) {
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            result = gcd(result, input[i]);
        }
        return result;
    }
}
