import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

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

    @Test
    public void theGridCanBeFullyTurnedOffOnceTurnedOn() {

        cl.turnOn(0,0, 999,999);
        cl.turnOff(0,0, 999,999);

        for (int x = 0; x < 1000; x++)
            for(int y = 0; y < 1000; y++)
                assertEquals(0, cl.getStatus(x,y), String.format("{%s} x {%s}", x, y));

    }
    @Test
    public void turningOnOnlyTheFirstLine() {

        cl.turnOn(0,0, 999,0);

        for (int x1 = 0; x1 < 1000; x1++)
            assertEquals(1, cl.getStatus(x1,0), String.format("x1:%s x %s", x1, 0));

        for (int x = 1; x < 1000; x++)
            for(int y = 1; y < 1000; y++)
                assertEquals(0, cl.getStatus(x,y), String.format("x:%s x y:%s", x, y));

    }

    @Test
    public void toggleChangeTheLightStatus() {

        cl.turnOn(0,0, 999,999);

        cl.toggle(0,0,999,999);

        for (int x = 1; x < 1000; x++)
            for(int y = 1; y < 1000; y++)
                assertEquals(0, cl.getStatus(x,y), String.format("x:%s x y:%s", x, y));
    }

    @Test
    public void overAllTest() { //Readme Example

        cl.turnOn(0,0, 999,999);

        cl.toggle(0,0,999,0);

        cl.turnOff(499,499, 500,500);

        int lightsCount = 0;

        for (int x = 1; x < 1000; x++)
            for(int y = 1; y < 1000; y++)
                 lightsCount += cl.getStatus(x,y);

        assertEquals(997997, lightsCount);
    }

    @Test
    public void lightsCanBeTurnedOnBasedOnInput()
    {
        var fileParser = mock(IFileParser.class);


    }
}
