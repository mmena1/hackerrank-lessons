import org.junit.Assert;
import org.junit.Test;

public class BirthdayChocolateTest {
    @Test
    public void solve() {
        int[] chocolate = new int[]{1, 2,1, 3, 2 };
        int result = BirthdayChocolate.solve(5, chocolate,3, 2);
        Assert.assertEquals(2, result);
    }
}
