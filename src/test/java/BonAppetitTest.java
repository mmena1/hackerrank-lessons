import org.junit.Assert;
import org.junit.Test;

public class BonAppetitTest {

    @Test
    public void solutionTest() {
        int[] items = {3, 10, 2, 9};
        Assert.assertEquals("5", BonAppetit.solution(4, 1, items, 12));
        Assert.assertEquals("Bon Appetit", BonAppetit.solution(4, 1, items, 7));
    }
}
