import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileParserTest {

    @Test
    public void fileParserCanParseTheInputString()
    {
        var parser = new FileParser();
        List<String> rowsToParse = List.of("turn off 660,55 through 986,197");

        var result = parser.Parse(rowsToParse);

        var actual = result.get(0);
        assertEquals("turn off", actual.action());
        assertEquals(660, actual.sourceX());
        assertEquals(55, actual.sourceY());
        assertEquals(986, actual.targetX());
        assertEquals(197, actual.targetY());
    }

    @Test
    public void rowsAreParsedAsAction(){
        var parser = new FileParser();
        var actual = parser.getRowParts("turn off 660,55 through 986,197");

        assertEquals("turn off", actual.action());
        assertEquals(660, actual.sourceX());
        assertEquals(55, actual.sourceY());
        assertEquals(986, actual.targetX());
        assertEquals(197, actual.targetY());

    }

    @Test
    public void toggleRowHas4Elements(){
        var parser = new FileParser();
        var actual = parser.getRowParts("toggle 322,558 through 977,958");

        assertEquals("toggle", actual.action());
        assertEquals(322, actual.sourceX());
        assertEquals(558, actual.sourceY());
        assertEquals(977, actual.targetX());
        assertEquals(958, actual.targetY());

    }
}
