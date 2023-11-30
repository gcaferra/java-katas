import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChristmasLightsTest {

    private ChristmasLights cl;

    @BeforeEach
    public void Init() {
        cl = new ChristmasLights();
    }
    @Test
    public void theGridShouldBe1000x1000AndAllOff(){
        for (int x = 0; x < 1000; x++)
            for(int y = 0; y < 1000; y++)
                assertEquals(0,cl.getStatus(x,y));
    }

    @Test
    public void theGridCanBeFullyTurnedOn() {

        cl.turnOn(0,0, 999,999);

        for (int x = 0; x < 1000; x++)
            for(int y = 0; y < 1000; y++)
                assertEquals(1, cl.getStatus(x,y), String.format("{%s} x {%s}", x, y));

    }
}
