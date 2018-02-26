import java.util.Scanner;

public class BonAppetit {
    static String solution (int n, int k, int[] items, int b) {
        int sum = 0;
        for (int i = 0; i < items.length; i++) {
            if (i != k) {
                sum += items[i];
            }
        }
        int annaShare = sum / 2;
        if (annaShare == b) {
            return "Bon Appetit";
        } else {
            return b - annaShare + "";
        }
    }

    static void read() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] items = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            items[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        String result = solution(n, k, items, b);
        System.out.println(result);
    }
}
