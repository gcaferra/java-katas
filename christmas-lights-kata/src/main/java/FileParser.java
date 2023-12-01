import java.util.ArrayList;
import java.util.List;

public class FileParser implements IFileParser {

    @Override
    public List<ActionItem> Parse(List<String> rowsToParse) {
        var parsedRows = new ArrayList<ActionItem>();
        for (var row : rowsToParse) {
            var rowParts = getRowParts(row);
        }
        return parsedRows;
    }

    public ActionItem getRowParts(String row) {
        var parts = row.split("\\s");

        return new ActionItem(parts[0] + " " + parts[1],
                Integer.parseInt(parts[2].split(",")[0]),
                Integer.parseInt(parts[2].split(",")[1]),
                Integer.parseInt(parts[4].split(",")[0]),
                Integer.parseInt(parts[4].split(",")[1])
                );
    }
}