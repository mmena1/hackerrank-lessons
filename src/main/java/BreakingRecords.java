public class BreakingRecords {
    static int[] breakingRecords(int[] score) {
        // Complete this function
        int highest = score[0];
        int lowest = score[0];
        int highestCount = 0;
        int lowestCount = 0;
        for (int i = 1; i < score.length; i++) {
            int actual = score[i];
            if (actual > highest) {
                highest = actual;
                highestCount++;
            } else {
                if (actual < lowest) {
                    lowest = actual;
                    lowestCount++;
                }
            }
        }

        return new int[]{highestCount, lowestCount};

    }
}
