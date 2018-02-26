import static org.junit.Assert.*;
import org.junit.Test;

public class KangarooTest {
    @Test
    public void kangarooTest() {
        Kangaroo kangaroo = new Kangaroo();
        assertEquals("YES", kangaroo.kangaroo(0,7,3,6));
        assertEquals("NO", kangaroo.kangaroo(1,7,8,5));
        assertEquals("YES", kangaroo.kangaroo(0,7,5,6));
    }
}
