import org.junit.Assert;
import org.junit.Test;

public class MigratoryBirdsTest {

    @Test
    public void MigratoryBirds() {
        int[] ar = {1, 4, 4 ,4 ,5, 3};
        Assert.assertEquals(4, MigratoryBirds.migratoryBirds(6, ar));

        int[] ar1 = {2, 1, 4 ,5, 2, 1, 3, 4, 5, 3};
        Assert.assertEquals(1, MigratoryBirds.migratoryBirds(6, ar1));
    }
}
