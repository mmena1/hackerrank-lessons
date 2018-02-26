import org.junit.Assert;
import org.junit.Test;

public class DayOfTheProgrammerTest {
    @Test
    public void solve() {
        Assert.assertEquals("13.09.2017", DayOfTheProgrammer.solve(2017));
        Assert.assertEquals("12.09.2016", DayOfTheProgrammer.solve(2016));
        Assert.assertEquals("12.09.1800", DayOfTheProgrammer.solve(1800));
    }
}
