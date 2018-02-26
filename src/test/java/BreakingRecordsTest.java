import org.junit.Assert;
import org.junit.Test;

public class BreakingRecordsTest {
    @Test
    public void breakingRecords() {
        int[] score = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        int[] records = BreakingRecords.breakingRecords(score);
        Assert.assertEquals(2, records[0]);
        Assert.assertEquals(4, records[1]);

        int[] score2 = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        int[] records2 = BreakingRecords.breakingRecords(score2);
        Assert.assertEquals(4, records2[0]);
        Assert.assertEquals(0, records2[1]);
    }
}
