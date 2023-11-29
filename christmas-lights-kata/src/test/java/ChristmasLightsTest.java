import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChristmasLightsTest {

    @Test
    public void theGridShouldBe1000x1000(){
        ChristmasLights cl = new ChristmasLights();
        for (int x = 0; x < 1000; x++)
            for(int y = 0; y < 1000; y++)
                assertEquals(0,cl.getStatus(x,y));
    }
}
