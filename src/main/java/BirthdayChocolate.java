public class BirthdayChocolate {

    static int solve(int n, int[] s, int d, int m) {
        // Complete this function
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            int sum = 0;
            for (int j = i; j < m + i; j++) {
                if (j >= s.length) {
                    break;
                }
                sum += s[j];
            }
            if (sum == d) {
                count++;
            }
        }
        return count;
    }
}
