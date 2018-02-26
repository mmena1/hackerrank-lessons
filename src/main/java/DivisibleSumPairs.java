public class DivisibleSumPairs {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        // Complete this function
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i +1; j < ar.length; j++) {
                if (i > j) {
                    break;
                }
                int sum = ar[i] + ar[j];
                if (sum % k == 0) {
                    System.out.println("(" + i + "," + j + ") ->" + sum);
                    count++;
                }
            }
        }
        return count;
    }
}
