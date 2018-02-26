import org.junit.Assert;
import org.junit.Test;

public class BetweenTwoSetsTest {
    @Test
    public void getTotalX() {
        int[] a = {2, 4};
        int[] b = {16, 32, 96};
        Assert.assertEquals(3, BetweenTwoSets.getTotalX(a, b));

        a = new int[] {2, 5};
        b = new int[] {16, 32, 96};
        Assert.assertEquals(0, BetweenTwoSets.getTotalX(a, b));

        a = new int[] {3, 5, 15};
        b = new int[] {30, 60, 120};
        Assert.assertEquals(2, BetweenTwoSets.getTotalX(a, b));

        a = new int[] {7};
        b = new int[] {28, 42, 49};
        Assert.assertEquals(1, BetweenTwoSets.getTotalX(a, b));
    }
}
