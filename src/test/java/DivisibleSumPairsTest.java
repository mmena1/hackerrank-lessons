import org.junit.Assert;
import org.junit.Test;

public class DivisibleSumPairsTest {

    @Test
    public void divisibleSumPairs() {
        int[] ar = {1, 3, 2, 6, 1, 2};
        Assert.assertEquals(5, DivisibleSumPairs.divisibleSumPairs(6, 3, ar));
    }
}
