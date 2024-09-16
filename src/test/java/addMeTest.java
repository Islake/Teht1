import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class addMeTest {

    App newApp = new App();
    @Test
    public void testAdd() {
        assertEquals(5, newApp.add(2, 3));
    }
}
