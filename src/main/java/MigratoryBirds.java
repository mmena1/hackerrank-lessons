public class MigratoryBirds {
    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        int[] birds = new int[5];
        for (int i = 1; i <= 5; i++) {
            int count = 0;
            for (int bird : ar) {
                if (bird == i) {
                    count++;
                }
            }
            birds[i - 1] = count;
        }
        int type = -1;
        int j = 1;
        for (int i = 0; i < birds.length; i++) {
            if (birds[i] > type) {
                type = birds[i];
                j = 1 + i;
            }
        }
        return j;
    }
}
