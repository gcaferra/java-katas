import junit.framework.TestCase;

public class BowlingGameTest extends TestCase {
    private Game g;
    @Override
    protected void setUp() throws Exception {
        g = new Game();
    }

    public void  testGutterGame() throws Exception {
        rollMany(0, 20);

        assertEquals(0, g.score());
    }

    public void testAllOne() throws Exception {
        rollMany(1, 20);

        assertEquals(20, g.score());
    }

    public void testOneSpare() throws Exception {
        g.roll(5);
        g.roll(5);
        g.roll(3);
        rollMany(0, 17);

        assertEquals(16, g.score());
    }

    public void testOneStrike() throws Exception {
        g.roll(10);
        g.roll(3);
        g.roll(4);
        rollMany(16,0);

        assertEquals(24, g.score());
    }

    public void testPerfectGame() throws Exception {
        rollMany(10,12);
        assertEquals(300, g.score());
    }

    private void rollMany(int pins, int rollCount) {
        for (int i = 0; i < rollCount; i++)
            g.roll(pins);
    }

}
